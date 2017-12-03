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
        
        // Initialize temp variables
        jFile.println(".field private static temp1 [I");
        
        // Global function
        // Print polynomial function
        jFile.println();
        jFile.println(".method public static print_array([I)V");
        jFile.println("  .limit stack 4");
        jFile.println("  .limit locals 2");
        jFile.println("  .var 0 is input_array [I from Label0 to Label88");
        jFile.println("  .var 1 is location I from Label3 to Label80");
        jFile.println("Label0:");
        jFile.println("  .line 27");
        jFile.println("  0: bipush 9");
        jFile.println("  2: istore_1");
        jFile.println("Label3:");
        jFile.println("  3: iload_1");
        jFile.println("  4: iflt Label80");
        jFile.println("  .line 28");
        jFile.println("  7: aload_0");
        jFile.println("  8: iload_1");
        jFile.println("  9: iaload");
        jFile.println("  10: ifeq Label74");
        jFile.println("  .line 29");
        jFile.println("  13: iload_1");
        jFile.println("  14: bipush 9");
        jFile.println("  16: if_icmpge Label27");
        jFile.println("  19: getstatic java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("  22: ldc \" + \"");
        jFile.println("  24: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        jFile.println("Label27:");
        jFile.println("  .line 30");
        jFile.println("  27: iload_1");
        jFile.println("  28: ifle Label65");
        jFile.println("  31: getstatic java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("  34: new java/lang/StringBuilder");
        jFile.println("  37: dup");
        jFile.println("  38: invokespecial java/lang/StringBuilder/<init>()V");
        jFile.println("  41: aload_0");
        jFile.println("  42: iload_1");
        jFile.println("  43: iaload");
        jFile.println("  44: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jFile.println("  47: ldc \"x^\"");
        jFile.println("  49: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        jFile.println("  52: iload_1");
        jFile.println("  53: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        jFile.println("  56: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
        jFile.println("  59: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        jFile.println("  62: goto Label74");
        jFile.println("Label65:");
        jFile.println("  .line 31");
        jFile.println("  65: getstatic java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("  68: aload_0");
        jFile.println("  69: iload_1");
        jFile.println("  70: iaload");
        jFile.println("  71: invokevirtual java/io/PrintStream/print(I)V");
        jFile.println("Label74:");
        jFile.println("  .line 27");
        jFile.println("  74: iinc 1 -1");
        jFile.println("  77: goto Label3");
        jFile.println("Label80:");
        jFile.println("  .line 34");
        jFile.println("  80: getstatic java/lang/System/out Ljava/io/PrintStream;");
        jFile.println("  83: ldc \"\n\"");
        jFile.println("  85: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        jFile.println("Label88:");
        jFile.println("  .line 35");
        jFile.println("  88: return");
        jFile.println("  ; append_frame (frameNumber = 0)");
        jFile.println("  ; frame_type = 252, offset_delta = 3");
        jFile.println("  ; frame bytes: 252 0 3 1 ");
        jFile.println("  .stack ");
        jFile.println("    offset 3");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; same_frame (frameNumber = 1)");
        jFile.println("  ; frame_type = 23, offset_delta = 23");
        jFile.println("  ; frame bytes: 23 ");
        jFile.println("  .stack ");
        jFile.println("    offset 27");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; same_frame (frameNumber = 2)");
        jFile.println("  ; frame_type = 37, offset_delta = 37");
        jFile.println("  ; frame bytes: 37 ");
        jFile.println("  .stack ");
        jFile.println("    offset 65");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; same_frame (frameNumber = 3)");
        jFile.println("  ; frame_type = 8, offset_delta = 8");
        jFile.println("  ; frame bytes: 8 ");
        jFile.println("  .stack ");
        jFile.println("    offset 74");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; chop_frame (frameNumber = 4)");
        jFile.println("  ; frame_type = 250, offset_delta = 5");
        jFile.println("  ; frame bytes: 250 0 5 ");
        jFile.println("  .stack ");
        jFile.println("    offset 80");
        jFile.println("    .end stack");
        jFile.println(".end method");
        
        // Add polynomial function
        jFile.println();
        jFile.println(".method public static add_polynomial([I[I)[I");
        jFile.println("  .limit stack 5");
        jFile.println("  .limit locals 4");
        jFile.println("  .line 25");
        jFile.println("  0: bipush 10");
        jFile.println("  2: newarray int");
        jFile.println("  4: astore_2");
        jFile.println("  .line 26");
        jFile.println("  5: iconst_0");
        jFile.println("  6: istore_3");
        jFile.println("Label7:");
        jFile.println("  7: iload_3");
        jFile.println("  8: bipush 10");
        jFile.println("  10: if_icmpge Label23");
        jFile.println("  .line 27");
        jFile.println("  13: aload_2");
        jFile.println("  14: iload_3");
        jFile.println("  15: iconst_0");
        jFile.println("  16: iastore");
        jFile.println("  .line 26");
        jFile.println("  17: iinc 3 1");
        jFile.println("  20: goto Label7");
        jFile.println("Label23:");
        jFile.println("  .line 30");
        jFile.println("  23: iconst_0");
        jFile.println("  24: istore_3");
        jFile.println("Label25:");
        jFile.println("  25: iload_3");
        jFile.println("  26: bipush 10");
        jFile.println("  28: if_icmpge Label47");
        jFile.println("  .line 31");
        jFile.println("  31: aload_2");
        jFile.println("  32: iload_3");
        jFile.println("  33: aload_0");
        jFile.println("  34: iload_3");
        jFile.println("  35: iaload");
        jFile.println("  36: aload_1");
        jFile.println("  37: iload_3");
        jFile.println("  38: iaload");
        jFile.println("  39: iadd");
        jFile.println("  40: iastore");
        jFile.println("  .line 30");
        jFile.println("  41: iinc 3 1");
        jFile.println("  44: goto Label25");
        jFile.println("Label47:");
        jFile.println("  .line 33");
        jFile.println("  47: aload_2");
        jFile.println("  48: areturn");
        jFile.println("  ; append_frame (frameNumber = 0)");
        jFile.println("  ; frame_type = 253, offset_delta = 7");
        jFile.println("  ; frame bytes: 253 0 7 7 0 13 1 ");
        jFile.println("  .stack ");
        jFile.println("    offset 7");
        jFile.println("    locals Object [I");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; chop_frame (frameNumber = 1)");
        jFile.println("  ; frame_type = 250, offset_delta = 15");
        jFile.println("  ; frame bytes: 250 0 15 ");
        jFile.println("  .stack ");
        jFile.println("    offset 23");
        jFile.println("    locals Object [I");
        jFile.println("    .end stack");
        jFile.println("  ; append_frame (frameNumber = 2)");
        jFile.println("  ; frame_type = 252, offset_delta = 1");
        jFile.println("  ; frame bytes: 252 0 1 1 ");
        jFile.println("  .stack ");
        jFile.println("    offset 25");
        jFile.println("    locals Object [I");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; chop_frame (frameNumber = 3)");
        jFile.println("  ; frame_type = 250, offset_delta = 21");
        jFile.println("  ; frame bytes: 250 0 21 ");
        jFile.println("  .stack ");
        jFile.println("    offset 47");
        jFile.println("    locals Object [I");
        jFile.println("    .end stack");
        jFile.println(".end method");
        
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
            typeIndicator = "[I";
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
	public Integer visitPolynomialExpr(PSLParser.PolynomialExprContext ctx) {
		ctx.type = Predefined.polynomialType;
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitConstant(PSLParser.ConstantContext ctx) {
		ctx.type = Predefined.integerType;
        return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitCoeficient(PSLParser.CoeficientContext ctx) { 
		ctx.type = Predefined.integerType;
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPower(PSLParser.PowerContext ctx) { 
		ctx.type = Predefined.integerType;
		return visitChildren(ctx); 
	}

	
}