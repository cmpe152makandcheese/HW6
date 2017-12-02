import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;


public class Pass1Visitor extends PSLBaseVisitor<Integer> {
	private SymTabStack symTabStack;
    private SymTabEntry programId;
    private SymTabEntry variableIdReference;
    private PrintWriter jFile;
    private Stack<Integer[]> polynomialReference = new Stack<Integer[]>();
    private Integer[] monomialReference;
    private Integer currentDepth;
    
    public Pass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
        currentDepth = 1;
    }
    
    public PrintWriter getAssemblyFile() { return jFile; }
	
	@Override 
	public Integer visitProgram(PSLParser.ProgramContext ctx) { 
		Integer value = visitChildren(ctx); 
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symTabStack);
        
        return value;
	}
	
	@Override 
	public Integer visitBlock(PSLParser.BlockContext ctx) { 
		String programName = "PSL";
        
        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        symTabStack.setProgramId(programId);
        
        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        
        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");
        
        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
        jFile.println(".field private static _standardIn LPascalTextIn;");

        return visitChildren(ctx);
	}
	
	@Override 
	public Integer visitDecl_list(PSLParser.Decl_listContext ctx) { 
        Integer value = visitChildren(ctx); 
        
        // Emit the class constructor.
        jFile.println();
        jFile.println(".method public <init>()V");
        jFile.println();
        jFile.println("\taload_0");
        jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 1");
        jFile.println(".limit stack 1");
        jFile.println(".end method");
        
        return value; 
	}

	@Override 
	public Integer visitDecl(PSLParser.DeclContext ctx) {
        jFile.println("\n; " + ctx.getText() + "\n");
        return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitVar_id(PSLParser.Var_idContext ctx) {
		String variableName = ctx.IDENTIFIER().toString();
        
        SymTabEntry variableId = symTabStack.enterLocal(variableName);
        variableId.setDefinition(VARIABLE);
        variableIdReference = variableId;
        
        return visitChildren(ctx); 
	}

	@Override 
	public Integer visitType_id(PSLParser.Type_idContext ctx) {
		String typeName = ctx.IDENTIFIER().toString();
        
        TypeSpec type;
        String   typeIndicator;
        
        if (typeName.equalsIgnoreCase("polynomial")) {
            type = Predefined.polynomialType;
            typeIndicator = "P";
        }
        else {
            type = null;
            typeIndicator = "?";
        }
                    
        SymTabEntry id = variableIdReference;
        id.setTypeSpec(type);
            
        // Emit a field declaration.
        jFile.println(".field private static " + id.getName() + " " + typeIndicator);

        
        return visitChildren(ctx);
	}
	
	@Override 
	public Integer visitAddExpr(PSLParser.AddExprContext ctx) { 
		Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean polynomialMode =    (type1 == Predefined.polynomialType)
                              && (type2 == Predefined.polynomialType);
        
        TypeSpec type = polynomialMode ? Predefined.polynomialType
                      :               null;
        ctx.type = type;
        
        return value; 
	}
	
	@Override 
	public Integer visitMulExpr(PSLParser.MulExprContext ctx) { 
		Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean polynomialMode =    (type1 == Predefined.polynomialType)
                              && (type2 == Predefined.polynomialType);
        
        TypeSpec type = polynomialMode ? Predefined.polynomialType
                      :               null;
        ctx.type = type;
        
        return value; 
	}
	
	@Override 
	public Integer visitVariableExpr(PSLParser.VariableExprContext ctx) { 
		String variableName = ctx.variable().IDENTIFIER().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);
        
        ctx.type = variableId.getTypeSpec();
        return visitChildren(ctx);  
	}
	
	@Override 
	public Integer visitParenExpr(PSLParser.ParenExprContext ctx) { 
		Integer value = visitChildren(ctx); 
        ctx.type = ctx.expr().type;
        return value;
	}

	@Override 
	public Integer visitStmt(PSLParser.StmtContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override 
	public Integer visitCompound_stmt(PSLParser.Compound_stmtContext ctx) {
		return visitChildren(ctx);
	}

	@Override 
	public Integer visitStmt_list(PSLParser.Stmt_listContext ctx) { 
		return visitChildren(ctx);
	}

	@Override 
	public Integer visitAssignment_stmt(PSLParser.Assignment_stmtContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitOrder_stmt(PSLParser.Order_stmtContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitVariable(PSLParser.VariableContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPolynomial(PSLParser.PolynomialContext ctx) {
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitMonomial(PSLParser.MonomialContext ctx) { 
		monomialReference = new Integer[2];
		monomialReference[0] = 1;
		monomialReference[1] = 1;
		
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitConstant(PSLParser.ConstantContext ctx) {
		ctx.type = Predefined.integerType;
		monomialReference[0] = Integer.parseInt(ctx.getText());
		monomialReference[1] = 0;
		polynomialReference.push(monomialReference);
        return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitCoeficient(PSLParser.CoeficientContext ctx) { 
		ctx.type = Predefined.integerType;
		monomialReference[0] = Integer.parseInt(ctx.getText());
		polynomialReference.push(monomialReference);
		currentDepth = ctx.depth();
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPower(PSLParser.PowerContext ctx) { 
		ctx.type = Predefined.integerType;
		if (ctx.depth() == currentDepth) {
			polynomialReference.pop();
		}
		monomialReference[1] = Integer.parseInt(ctx.getText());
		polynomialReference.push(monomialReference);
		
		return visitChildren(ctx); 
	}

	
}