import java.io.PrintWriter;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Pass2Visitor extends PSLBaseVisitor<Integer> {
	
	String programName;
    private PrintWriter jFile;
    private Integer[] monomialReference;
    private Integer orderCount;
    
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
        orderCount = 0;
    }
    
	@Override 
	public Integer visitProgram(PSLParser.ProgramContext ctx) { 
		Integer value = visitChildren(ctx); 
        jFile.close();
        return value; 
	}
	
	@Override 
	public Integer visitBlock(PSLParser.BlockContext ctx) {
        programName = "PSL";
        
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");
        
        Integer value = visitChildren(ctx);
        
        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");
        
        return value;
	}
	
	@Override 
	public Integer visitStmt(PSLParser.StmtContext ctx) { 
		jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
	}

	@Override 
	public Integer visitAssignment_stmt(PSLParser.Assignment_stmtContext ctx) { 
        Integer value = visit(ctx.expr());
        
        String typeIndicator = (ctx.expr().type == Predefined.polynomialType) ? "[I"
                             :                                    "?";
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " " + typeIndicator);

        return value;	
    }
	
	@Override 
	public Integer visitPrint_stmt(PSLParser.Print_stmtContext ctx) { 
		Integer value = visit(ctx.expr());

		if (ctx.expr().type == Predefined.polynomialType) {
			jFile.println("\tinvokestatic PSL/print_array([I)V\t");
		}
		
		return value; 
	}
	
	@Override 
	public Integer visitPrint_boolean_stmt(PSLParser.Print_boolean_stmtContext ctx) { 
		jFile.println("\tinvokestatic PSL/print_boolean(I)V\t");
		
		return visitChildren(ctx);
	}
	
	@Override 
	public Integer visitOrder_stmt(PSLParser.Order_stmtContext ctx) {
		orderCount++;
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		
		jFile.println("\tinvokestatic PSL/order([I[I)I\t");
		jFile.println("\tifeq LabelExitOrder" + orderCount + "\t");
		Integer value = visit(ctx.compound_stmt());
		jFile.println("\tLabelExitOrder" + orderCount + ":\t");
		
		return value;
	}


	@Override 
	public Integer visitDerivative_stmt(PSLParser.Derivative_stmtContext ctx) { 
		Integer value = visit(ctx.variable());
		
		String typeIndicator = (ctx.variable().type == Predefined.polynomialType) ? "[I"
                :                                    "?";
		
		if (ctx.variable().type == Predefined.polynomialType) {
			// Put variable into stack
	        jFile.println("\tgetstatic\t" + programName
	                           +  "/" + ctx.variable().IDENTIFIER().toString() 
	                           + " " + typeIndicator);
			// Derive
			jFile.println("\tinvokestatic PSL/derive([I)[I\t");
			// Emit a field put instruction.
	        jFile.println("\tputstatic\t" + programName
	                           +  "/" + ctx.variable().IDENTIFIER().toString() 
	                           + " " + typeIndicator);
		}
		
		return value;
	}
	
	@Override 
	public Integer visitAddExpr(PSLParser.AddExprContext ctx) { 
        Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean polynomialMode =	(type1 == Predefined.polynomialType)
							  	 && (type2 == Predefined.polynomialType);
        
        String op = ctx.ADD_OP().getText();
        String opcode;	
        
        if (op.equals("+!")) {
            opcode = polynomialMode ? "add_polynomial"
                   :                  "????";
        }
        else {
            opcode = polynomialMode ? "sub_polynomial"
                   :              	  "????";
        }
        
        // Emit an add or subtract instruction.
        jFile.println("\tinvokestatic PSL/" + opcode + "([I[I)[I");
        
        return value; 
    }
	
	@Override 
	public Integer visitMulExpr(PSLParser.MulExprContext ctx) { 
		Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean polynomialMode =	(type1 == Predefined.polynomialType)
							  	 && (type2 == Predefined.polynomialType);
        
        String op = ctx.MUL_OP().getText();
        String opcode;	
        
        // TODO: This is probably wrong, needs to be changed to custom mult 
        //       not just assembly mult
        if (op.equals("*!")) {
            opcode = polynomialMode ? "imul"
                   :                  "????";
        }
        else {
            opcode = polynomialMode ? "idiv"
                   :              	  "????";
        }
        
        // TODO: Remove later
        jFile.println("THIS EXPR IS WRONG :)");
        
        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);
        
        return value; 	
    }
	
	@Override 
	public Integer visitVariableExpr(PSLParser.VariableExprContext ctx) { 
        String variableName = ctx.variable().IDENTIFIER().toString();
        TypeSpec type = ctx.type;
        
        String typeIndicator = (type == Predefined.polynomialType) ? "[I"
                             :                                    "?";
        
        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                      "/" + variableName + " " + typeIndicator);

        return visitChildren(ctx); 	
    }
	
	@Override 
	public Integer visitPolynomialExpr(PSLParser.PolynomialExprContext ctx) {
		ctx.type = Predefined.polynomialType;
		
		// Push polynomial array to stack
		jFile.println("\tbipush 10\t");
		jFile.println("\tnewarray int\t");
		jFile.println("\tputstatic    PSL/temp1 [I\t");
		jFile.println("\tgetstatic PSL/temp1 [I\t");
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitMonomial(PSLParser.MonomialContext ctx) { 
		monomialReference = new Integer[2];
		monomialReference[0] = 1;
		monomialReference[1] = 1;
		
		// Check if coeficient child exists
		try {
			monomialReference[0] = Integer.parseInt(ctx.coeficient().getText());
		}
		catch (java.lang.NullPointerException e) {
			// Ignore
		}
		
		// Check if power child exists
		try {
			monomialReference[1] = Integer.parseInt(ctx.power().getText());
		}
		catch (java.lang.NullPointerException e) {
			// Ignore
		}
		
		// Check if constant child exists
		try {
			monomialReference[0] = Integer.parseInt(ctx.constant().getText());
			monomialReference[1] = 0;
		}
		catch (java.lang.NullPointerException e) {
			// Ignore
		}
		
		jFile.println("\tbipush " + monomialReference[1] + "\t");
		jFile.println("\tbipush " + monomialReference[0] + "\t");
		jFile.println("\tiastore\t");
		jFile.println("\tgetstatic PSL/temp1 [I\t");
		
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitConstant(PSLParser.ConstantContext ctx) {
        return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitCoeficient(PSLParser.CoeficientContext ctx) {
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPower(PSLParser.PowerContext ctx) { 
		return visitChildren(ctx); 
	}


}