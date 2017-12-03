import java.io.PrintWriter;

import org.antlr.v4.runtime.misc.NotNull;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Pass2Visitor extends PSLBaseVisitor<Integer> {
	
	String programName;
    private PrintWriter jFile;
    
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
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
	public Integer visitAddExpr(PSLParser.AddExprContext ctx) { 
        Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean polynomialMode =	(type1 == Predefined.polynomialType)
							  	 && (type2 == Predefined.polynomialType);
        
        String op = ctx.ADD_OP().getText();
        String opcode;	
        
        // TODO: This is probably wrong, needs to be changed to custom add 
        //       not just assembly add
        if (op.equals("+!")) {
            opcode = polynomialMode ? "iadd"
                   :                  "????";
        }
        else {
            opcode = polynomialMode ? "isub"
                   :              	  "????";
        }
        
        // TODO: Remove later
//        jFile.println("THIS EXPR IS WRONG :)");
        
        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);
        
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