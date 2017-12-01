import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;


public class Pass1Visitor extends PSLBaseVisitor<Integer> {
	private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;
    private PrintWriter jFile;
    
    public Pass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
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
		return visitChildren(ctx);
	}

	@Override 
	public Integer visitType_id(PSLParser.Type_idContext ctx) {
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
	public Integer visitExpr(PSLParser.ExprContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPolynomial(PSLParser.PolynomialContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitMonomial(PSLParser.MonomialContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitConstant(PSLParser.ConstantContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitSign(PSLParser.SignContext ctx) { 
		return visitChildren(ctx); 
	}
}