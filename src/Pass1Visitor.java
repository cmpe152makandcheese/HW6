import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;

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
	
	@Override public Integer visitAddExpr(PSLParser.AddExprContext ctx) { 
        return visitChildren(ctx);
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
		System.out.println("polynomial");
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitMonomial(PSLParser.MonomialContext ctx) { 
		System.out.println("monomial");
		monomialReference = new Integer[2];
		monomialReference[0] = 1;
		monomialReference[1] = 1;
		
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitConstant(PSLParser.ConstantContext ctx) {
		System.out.println("Monomial of power 0");
		ctx.type = Predefined.integerType;
		monomialReference[0] = Integer.parseInt(ctx.getText());
		monomialReference[1] = 0;
		System.out.println("Add to poly... " + monomialReference[0] + "x^" + monomialReference[1]);
		polynomialReference.push(monomialReference);
        return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitCoeficient(PSLParser.CoeficientContext ctx) { 
		System.out.println("coeficient");
		monomialReference[0] = Integer.parseInt(ctx.getText());
		System.out.println("Add to poly... " + monomialReference[0] + "x^" + monomialReference[1]);
		polynomialReference.push(monomialReference);
		currentDepth = ctx.depth();
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPower(PSLParser.PowerContext ctx) { 
		System.out.println("power");
		if (ctx.depth() == currentDepth) {
			System.out.println("Fixing poly...");
			polynomialReference.pop();
		}
		monomialReference[1] = Integer.parseInt(ctx.getText());
		System.out.println("Add to poly... " + monomialReference[0] + "x^" + monomialReference[1]);
		polynomialReference.push(monomialReference);
		
		
		if (ctx.depth() == 15) {
			System.out.println("Printing whole polynomial");
			Integer s = polynomialReference.size();
			for (Integer i=0; i<s; i++) {
				Integer[] temp = new Integer[2];
				temp = polynomialReference.pop();
				System.out.println("Index: " + i + " " + temp[0] + "x^" + temp[1]);
			}
		}
		
		return visitChildren(ctx); 
	}

	
}