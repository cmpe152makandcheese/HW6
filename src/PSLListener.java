// Generated from PSL.g4 by ANTLR 4.4

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSLParser}.
 */
public interface PSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(@NotNull PSLParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(@NotNull PSLParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull PSLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull PSLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(@NotNull PSLParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(@NotNull PSLParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull PSLParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull PSLParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull PSLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull PSLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#function_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_list(@NotNull PSLParser.Function_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#function_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_list(@NotNull PSLParser.Function_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOrder_stmt(@NotNull PSLParser.Order_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOrder_stmt(@NotNull PSLParser.Order_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull PSLParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull PSLParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(@NotNull PSLParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(@NotNull PSLParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(@NotNull PSLParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(@NotNull PSLParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(@NotNull PSLParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(@NotNull PSLParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 */
	void enterMonomial(@NotNull PSLParser.MonomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 */
	void exitMonomial(@NotNull PSLParser.MonomialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(@NotNull PSLParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(@NotNull PSLParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull PSLParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull PSLParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(@NotNull PSLParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(@NotNull PSLParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stmt(@NotNull PSLParser.Function_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#function_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stmt(@NotNull PSLParser.Function_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(@NotNull PSLParser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(@NotNull PSLParser.Repeat_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull PSLParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull PSLParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(@NotNull PSLParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(@NotNull PSLParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#print_boolean_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_boolean_stmt(@NotNull PSLParser.Print_boolean_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#print_boolean_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_boolean_stmt(@NotNull PSLParser.Print_boolean_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(@NotNull PSLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(@NotNull PSLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(@NotNull PSLParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(@NotNull PSLParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(@NotNull PSLParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(@NotNull PSLParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(@NotNull PSLParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(@NotNull PSLParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(@NotNull PSLParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(@NotNull PSLParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#func_id}.
	 * @param ctx the parse tree
	 */
	void enterFunc_id(@NotNull PSLParser.Func_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#func_id}.
	 * @param ctx the parse tree
	 */
	void exitFunc_id(@NotNull PSLParser.Func_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#func_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type(@NotNull PSLParser.Func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#func_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type(@NotNull PSLParser.Func_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code polynomialExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPolynomialExpr(@NotNull PSLParser.PolynomialExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code polynomialExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPolynomialExpr(@NotNull PSLParser.PolynomialExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#derivative_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDerivative_stmt(@NotNull PSLParser.Derivative_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#derivative_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDerivative_stmt(@NotNull PSLParser.Derivative_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(@NotNull PSLParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(@NotNull PSLParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(@NotNull PSLParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(@NotNull PSLParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void enterPolynomial(@NotNull PSLParser.PolynomialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 */
	void exitPolynomial(@NotNull PSLParser.PolynomialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull PSLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull PSLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull PSLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull PSLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull PSLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull PSLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSLParser#coeficient}.
	 * @param ctx the parse tree
	 */
	void enterCoeficient(@NotNull PSLParser.CoeficientContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSLParser#coeficient}.
	 * @param ctx the parse tree
	 */
	void exitCoeficient(@NotNull PSLParser.CoeficientContext ctx);
}