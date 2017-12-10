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
        
        printStockFunctions(jFile);
        
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
        else if (typeName.equalsIgnoreCase("constant")) {
            type = Predefined.integerType;
            typeIndicator = "I";
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
	public Integer visitVariable(PSLParser.VariableContext ctx) { 
		String variableName = ctx.IDENTIFIER().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);
        
        ctx.type = variableId.getTypeSpec();
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

	private void printStockFunctions(PrintWriter jFile) {
        // Order_helper function
		jFile.println();
		jFile.println(".method public static order_helper([I)I");
		jFile.println("  .limit stack 2");
		jFile.println("  .limit locals 2");
		jFile.println("  .var 0 is high_input_array [I from Label0 to Label22");
		jFile.println("  .var 1 is power I from Label3 to Label21");
		jFile.println("Label0:");
		jFile.println("  .line 52");
		jFile.println("  0: bipush 9");
		jFile.println("  2: istore_1");
		jFile.println("Label3:");
		jFile.println("  3: iload_1");
		jFile.println("  4: iflt Label21");
		jFile.println("  .line 53");
		jFile.println("  7: aload_0");
		jFile.println("  8: iload_1");
		jFile.println("  9: iaload");
		jFile.println("  10: ifeq Label15");
		jFile.println("  13: iload_1");
		jFile.println("  14: ireturn");
		jFile.println("Label15:");
		jFile.println("  .line 52");
		jFile.println("  15: iinc 1 -1");
		jFile.println("  18: goto Label3");
		jFile.println("Label21:");
		jFile.println("  .line 55");
		jFile.println("  21: iconst_0");
		jFile.println("Label22:");
		jFile.println("  22: ireturn");
		jFile.println("  ; append_frame (frameNumber = 0)");
		jFile.println("  ; frame_type = 252, offset_delta = 3");
		jFile.println("  ; frame bytes: 252 0 3 1 ");
		jFile.println("  .stack ");
		jFile.println("    offset 3");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 1)");
		jFile.println("  ; frame_type = 11, offset_delta = 11");
		jFile.println("  ; frame bytes: 11 ");
		jFile.println("  .stack ");
		jFile.println("    offset 15");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; chop_frame (frameNumber = 2)");
		jFile.println("  ; frame_type = 250, offset_delta = 5");
		jFile.println("  ; frame bytes: 250 0 5 ");
		jFile.println("  .stack ");
		jFile.println("    offset 21");
		jFile.println("    .end stack");
		jFile.println(".end method");
		
		// Lowest_power function
		jFile.println();
		jFile.println(".method public static lowest_power([I)I");
		jFile.println("  .limit stack 2");
		jFile.println("  .limit locals 2");
		jFile.println("  .var 0 is low_input_array [I from Label0 to Label23");
		jFile.println("  .var 1 is power I from Label2 to Label22");
		jFile.println("Label0:");
		jFile.println("  .line 59");
		jFile.println("  0: iconst_0");
		jFile.println("  1: istore_1");
		jFile.println("Label2:");
		jFile.println("  2: iload_1");
		jFile.println("  3: bipush 10");
		jFile.println("  5: if_icmpge Label22");
		jFile.println("  .line 60");
		jFile.println("  8: aload_0");
		jFile.println("  9: iload_1");
		jFile.println("  10: iaload");
		jFile.println("  11: ifeq Label16");
		jFile.println("  14: iload_1");
		jFile.println("  15: ireturn");
		jFile.println("Label16:");
		jFile.println("  .line 59");
		jFile.println("  16: iinc 1 1");
		jFile.println("  19: goto Label2");
		jFile.println("Label22:");
		jFile.println("  .line 62");
		jFile.println("  22: iconst_0");
		jFile.println("Label23:");
		jFile.println("  23: ireturn");
		jFile.println("  ; append_frame (frameNumber = 0)");
		jFile.println("  ; frame_type = 252, offset_delta = 2");
		jFile.println("  ; frame bytes: 252 0 2 1 ");
		jFile.println("  .stack ");
		jFile.println("    offset 2");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 1)");
		jFile.println("  ; frame_type = 13, offset_delta = 13");
		jFile.println("  ; frame bytes: 13 ");
		jFile.println("  .stack ");
		jFile.println("    offset 16");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; chop_frame (frameNumber = 2)");
		jFile.println("  ; frame_type = 250, offset_delta = 5");
		jFile.println("  ; frame bytes: 250 0 5 ");
		jFile.println("  .stack ");
		jFile.println("    offset 22");
		jFile.println("    .end stack");
		jFile.println(".end method");
		
		// Order function
		jFile.println(".method public static order([I[I)I");
		jFile.println("  .limit stack 2");
		jFile.println("  .limit locals 2");
		jFile.println("  .var 0 is input_order [I from Label0 to Label24");
		jFile.println("  .var 1 is input_array [I from Label0 to Label24");
		jFile.println("Label0:");
		jFile.println("  .line 50");
		jFile.println("  0: aload_0");
		jFile.println("  1: invokestatic PSL/order_helper([I)I");
		jFile.println("  4: ifne Label23");
		jFile.println("  .line 51");
		jFile.println("  7: aload_0");
		jFile.println("  8: iconst_0");
		jFile.println("  9: iaload");
		jFile.println("  10: iconst_1");
		jFile.println("  11: iadd");
		jFile.println("  12: aload_1");
		jFile.println("  13: invokestatic PSL/order_helper([I)I");
		jFile.println("  16: if_icmpgt Label21");
		jFile.println("  19: iconst_1");
		jFile.println("  20: ireturn");
		jFile.println("Label21:");
		jFile.println("  .line 52");
		jFile.println("  21: iconst_0");
		jFile.println("  22: ireturn");
		jFile.println("Label23:");
		jFile.println("  .line 54");
		jFile.println("  23: iconst_0");
		jFile.println("Label24:");
		jFile.println("  24: ireturn");
		jFile.println("  ; same_frame (frameNumber = 0)");
		jFile.println("  ; frame_type = 21, offset_delta = 21");
		jFile.println("  ; frame bytes: 21 ");
		jFile.println("  .stack ");
		jFile.println("    offset 21");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 1)");
		jFile.println("  ; frame_type = 1, offset_delta = 1");
		jFile.println("  ; frame bytes: 1 ");
		jFile.println("  .stack ");
		jFile.println("    offset 23");
		jFile.println("    .end stack");
		jFile.println(".end method");
		
		// Print polynomial function
		jFile.println();
		jFile.println(".method public static print_array([I)V");
		jFile.println("  .limit stack 3");
		jFile.println("  .limit locals 5");
		jFile.println("  .var 0 is input_array [I from Label0 to Label227");
		jFile.println("  .var 1 is low_power I from Label5 to Label227");
		jFile.println("  .var 2 is high_power I from Label10 to Label227");
		jFile.println("  .var 3 is power I from Label12 to Label196");
		jFile.println("  .var 4 is coefficient I from Label22 to Label190");
		jFile.println("Label0:");
		jFile.println("  .line 67");
		jFile.println("  0: aload_0");
		jFile.println("  1: invokestatic PSL/lowest_power([I)I");
		jFile.println("  4: istore_1");
		jFile.println("Label5:");
		jFile.println("  .line 68");
		jFile.println("  5: aload_0");
		jFile.println("  6: invokestatic PSL/order_helper([I)I");
		jFile.println("  9: istore_2");
		jFile.println("Label10:");
		jFile.println("  .line 69");
		jFile.println("  10: iload_2");
		jFile.println("  11: istore_3");
		jFile.println("Label12:");
		jFile.println("  12: iload_3");
		jFile.println("  13: iload_1");
		jFile.println("  14: if_icmplt Label196");
		jFile.println("  .line 70");
		jFile.println("  17: aload_0");
		jFile.println("  18: iload_3");
		jFile.println("  19: iaload");
		jFile.println("  20: istore 4");
		jFile.println("Label22:");
		jFile.println("  .line 71");
		jFile.println("  22: iload 4");
		jFile.println("  24: ifeq Label97");
		jFile.println("  27: iload_3");
		jFile.println("  28: iconst_1");
		jFile.println("  29: if_icmple Label97");
		jFile.println("  .line 72");
		jFile.println("  32: iload 4");
		jFile.println("  34: iconst_1");
		jFile.println("  35: if_icmpgt Label44");
		jFile.println("  38: iload 4");
		jFile.println("  40: iconst_m1");
		jFile.println("  41: if_icmpge Label55");
		jFile.println("Label44:");
		jFile.println("  44: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  47: iload 4");
		jFile.println("  49: invokevirtual java/io/PrintStream/print(I)V");
		jFile.println("  52: goto Label69");
		jFile.println("Label55:");
		jFile.println("  .line 73");
		jFile.println("  55: iload 4");
		jFile.println("  57: iconst_m1");
		jFile.println("  58: if_icmpne Label69");
		jFile.println("  61: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  64: ldc \"-\"");
		jFile.println("  66: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("Label69:");
		jFile.println("  .line 74");
		jFile.println("  69: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  72: new java/lang/StringBuilder");
		jFile.println("  75: dup");
		jFile.println("  76: invokespecial java/lang/StringBuilder/<init>()V");
		jFile.println("  79: ldc \"x^\"");
		jFile.println("  81: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
		jFile.println("  84: iload_3");
		jFile.println("  85: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
		jFile.println("  88: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
		jFile.println("  91: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("  94: goto Label172");
		jFile.println("Label97:");
		jFile.println("  .line 76");
		jFile.println("  97: iload 4");
		jFile.println("  99: ifeq Label155");
		jFile.println("  102: iload_3");
		jFile.println("  103: iconst_1");
		jFile.println("  104: if_icmpne Label155");
		jFile.println("  .line 77");
		jFile.println("  107: iload 4");
		jFile.println("  109: iconst_1");
		jFile.println("  110: if_icmpgt Label119");
		jFile.println("  113: iload 4");
		jFile.println("  115: iconst_m1");
		jFile.println("  116: if_icmpge Label130");
		jFile.println("Label119:");
		jFile.println("  119: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  122: iload 4");
		jFile.println("  124: invokevirtual java/io/PrintStream/print(I)V");
		jFile.println("  127: goto Label144");
		jFile.println("Label130:");
		jFile.println("  .line 78");
		jFile.println("  130: iload 4");
		jFile.println("  132: iconst_m1");
		jFile.println("  133: if_icmpne Label144");
		jFile.println("  136: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  139: ldc \"-\"");
		jFile.println("  141: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("Label144:");
		jFile.println("  .line 79");
		jFile.println("  144: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  147: ldc \"x\"");
		jFile.println("  149: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("  152: goto Label172");
		jFile.println("Label155:");
		jFile.println("  .line 81");
		jFile.println("  155: iload_3");
		jFile.println("  156: ifne Label172");
		jFile.println("  159: iload 4");
		jFile.println("  161: ifeq Label172");
		jFile.println("  .line 82");
		jFile.println("  164: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  167: iload 4");
		jFile.println("  169: invokevirtual java/io/PrintStream/print(I)V");
		jFile.println("Label172:");
		jFile.println("  .line 84");
		jFile.println("  172: iload_3");
		jFile.println("  173: iload_1");
		jFile.println("  174: if_icmpeq Label190");
		jFile.println("  177: iload 4");
		jFile.println("  179: ifeq Label190");
		jFile.println("  182: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  185: ldc \" + \"");
		jFile.println("  187: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("Label190:");
		jFile.println("  .line 69");
		jFile.println("  190: iinc 3 -1");
		jFile.println("  193: goto Label12");
		jFile.println("Label196:");
		jFile.println("  .line 86");
		jFile.println("  196: iload_1");
		jFile.println("  197: iload_2");
		jFile.println("  198: if_icmpne Label219");
		jFile.println("  201: iload_1");
		jFile.println("  202: ifne Label219");
		jFile.println("  205: aload_0");
		jFile.println("  206: iconst_0");
		jFile.println("  207: iaload");
		jFile.println("  208: ifne Label219");
		jFile.println("  211: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  214: ldc \"0\"");
		jFile.println("  216: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("Label219:");
		jFile.println("  .line 87");
		jFile.println("  219: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  222: ldc \"\n\"");
		jFile.println("  224: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
		jFile.println("Label227:");
		jFile.println("  .line 88");
		jFile.println("  227: return");
		jFile.println("  ; append_frame (frameNumber = 0)");
		jFile.println("  ; frame_type = 254, offset_delta = 12");
		jFile.println("  ; frame bytes: 254 0 12 1 1 1 ");
		jFile.println("  .stack ");
		jFile.println("    offset 12");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; append_frame (frameNumber = 1)");
		jFile.println("  ; frame_type = 252, offset_delta = 31");
		jFile.println("  ; frame bytes: 252 0 31 1 ");
		jFile.println("  .stack ");
		jFile.println("    offset 44");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 2)");
		jFile.println("  ; frame_type = 10, offset_delta = 10");
		jFile.println("  ; frame bytes: 10 ");
		jFile.println("  .stack ");
		jFile.println("    offset 55");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 3)");
		jFile.println("  ; frame_type = 13, offset_delta = 13");
		jFile.println("  ; frame bytes: 13 ");
		jFile.println("  .stack ");
		jFile.println("    offset 69");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 4)");
		jFile.println("  ; frame_type = 27, offset_delta = 27");
		jFile.println("  ; frame bytes: 27 ");
		jFile.println("  .stack ");
		jFile.println("    offset 97");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 5)");
		jFile.println("  ; frame_type = 21, offset_delta = 21");
		jFile.println("  ; frame bytes: 21 ");
		jFile.println("  .stack ");
		jFile.println("    offset 119");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 6)");
		jFile.println("  ; frame_type = 10, offset_delta = 10");
		jFile.println("  ; frame bytes: 10 ");
		jFile.println("  .stack ");
		jFile.println("    offset 130");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 7)");
		jFile.println("  ; frame_type = 13, offset_delta = 13");
		jFile.println("  ; frame bytes: 13 ");
		jFile.println("  .stack ");
		jFile.println("    offset 144");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 8)");
		jFile.println("  ; frame_type = 10, offset_delta = 10");
		jFile.println("  ; frame bytes: 10 ");
		jFile.println("  .stack ");
		jFile.println("    offset 155");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 9)");
		jFile.println("  ; frame_type = 16, offset_delta = 16");
		jFile.println("  ; frame bytes: 16 ");
		jFile.println("  .stack ");
		jFile.println("    offset 172");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; chop_frame (frameNumber = 10)");
		jFile.println("  ; frame_type = 250, offset_delta = 17");
		jFile.println("  ; frame bytes: 250 0 17 ");
		jFile.println("  .stack ");
		jFile.println("    offset 190");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; chop_frame (frameNumber = 11)");
		jFile.println("  ; frame_type = 250, offset_delta = 5");
		jFile.println("  ; frame bytes: 250 0 5 ");
		jFile.println("  .stack ");
		jFile.println("    offset 196");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 12)");
		jFile.println("  ; frame_type = 22, offset_delta = 22");
		jFile.println("  ; frame bytes: 22 ");
		jFile.println("  .stack ");
		jFile.println("    offset 219");
		jFile.println("    locals Integer");
		jFile.println("    locals Integer");
		jFile.println("    .end stack");
		jFile.println(".end method");
		
		// Print boolean function
		jFile.println(".method public static print_boolean(I)V");
		jFile.println("  .limit stack 2");
		jFile.println("  .limit locals 1");
		jFile.println("  .var 0 is input_bool I from Label0 to Label24");
		jFile.println("Label0:");
		jFile.println("  .line 143");
		jFile.println("  0: iload_0");
		jFile.println("  1: iconst_1");
		jFile.println("  2: if_icmpne Label16");
		jFile.println("  5: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  8: ldc \"TRUE\"");
		jFile.println("  10: invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		jFile.println("  13: goto Label24");
		jFile.println("Label16:");
		jFile.println("  .line 144");
		jFile.println("  16: getstatic java/lang/System/out Ljava/io/PrintStream;");
		jFile.println("  19: ldc \"FALSE\"");
		jFile.println("  21: invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
		jFile.println("Label24:");
		jFile.println("  .line 145");
		jFile.println("  24: return");
		jFile.println("  ; same_frame (frameNumber = 0)");
		jFile.println("  ; frame_type = 16, offset_delta = 16");
		jFile.println("  ; frame bytes: 16 ");
		jFile.println("  .stack ");
		jFile.println("    offset 16");
		jFile.println("    .end stack");
		jFile.println("  ; same_frame (frameNumber = 1)");
		jFile.println("  ; frame_type = 7, offset_delta = 7");
		jFile.println("  ; frame bytes: 7 ");
		jFile.println("  .stack ");
		jFile.println("    offset 24");
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
        
        // Derive
        jFile.println();
        jFile.println(".method public static derive([I)[I");
        jFile.println("  .limit stack 3");
        jFile.println("  .limit locals 4");
        jFile.println("  .var 0 is input_array [I from Label0 to Label37");
        jFile.println("  .var 1 is returnArray [I from Label5 to Label37");
        jFile.println("  .var 2 is power I from Label8 to Label36");
        jFile.println("  .var 3 is new_coefficient I from Label24 to Label30");
        jFile.println("Label0:");
        jFile.println("  .line 91");
        jFile.println("  0: bipush 10");
        jFile.println("  2: newarray int");
        jFile.println("  4: astore_1");
        jFile.println("Label5:");
        jFile.println("  .line 92");
        jFile.println("  5: bipush 9");
        jFile.println("  7: istore_2");
        jFile.println("Label8:");
        jFile.println("  8: iload_2");
        jFile.println("  9: ifle Label36");
        jFile.println("  .line 94");
        jFile.println("  12: aload_0");
        jFile.println("  13: iload_2");
        jFile.println("  14: iaload");
        jFile.println("  15: ifeq Label30");
        jFile.println("  .line 95");
        jFile.println("  18: iload_2");
        jFile.println("  19: aload_0");
        jFile.println("  20: iload_2");
        jFile.println("  21: iaload");
        jFile.println("  22: imul");
        jFile.println("  23: istore_3");
        jFile.println("Label24:");
        jFile.println("  .line 96");
        jFile.println("  24: aload_1");
        jFile.println("  25: iload_2");
        jFile.println("  26: iconst_1");
        jFile.println("  27: isub");
        jFile.println("  28: iload_3");
        jFile.println("  29: iastore");
        jFile.println("Label30:");
        jFile.println("  .line 92");
        jFile.println("  30: iinc 2 -1");
        jFile.println("  33: goto Label8");
        jFile.println("Label36:");
        jFile.println("  .line 99");
        jFile.println("  36: aload_1");
        jFile.println("Label37:");
        jFile.println("  37: areturn");
        jFile.println("  ; append_frame (frameNumber = 0)");
        jFile.println("  ; frame_type = 253, offset_delta = 8");
        jFile.println("  ; frame bytes: 253 0 8 7 0 41 1 ");
        jFile.println("  .stack ");
        jFile.println("    offset 8");
        jFile.println("    locals Object [I");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; same_frame (frameNumber = 1)");
        jFile.println("  ; frame_type = 21, offset_delta = 21");
        jFile.println("  ; frame bytes: 21 ");
        jFile.println("  .stack ");
        jFile.println("    offset 30");
        jFile.println("    locals Object [I");
        jFile.println("    locals Integer");
        jFile.println("    .end stack");
        jFile.println("  ; chop_frame (frameNumber = 2)");
        jFile.println("  ; frame_type = 250, offset_delta = 5");
        jFile.println("  ; frame bytes: 250 0 5 ");
        jFile.println("  .stack ");
        jFile.println("    offset 36");
        jFile.println("    locals Object [I");
        jFile.println("    .end stack");
        jFile.println(".end method");
    }
	
}