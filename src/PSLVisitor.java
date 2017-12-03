// Generated from PSL.g4 by ANTLR 4.4

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(@NotNull PSLParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull PSLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull PSLParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(@NotNull PSLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_stmt(@NotNull PSLParser.Order_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull PSLParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(@NotNull PSLParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(@NotNull PSLParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonomial(@NotNull PSLParser.MonomialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(@NotNull PSLParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull PSLParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(@NotNull PSLParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull PSLParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(@NotNull PSLParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(@NotNull PSLParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id(@NotNull PSLParser.Type_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code polynomialExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolynomialExpr(@NotNull PSLParser.PolynomialExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#derivative_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivative_stmt(@NotNull PSLParser.Derivative_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull PSLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(@NotNull PSLParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolynomial(@NotNull PSLParser.PolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull PSLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull PSLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#coeficient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoeficient(@NotNull PSLParser.CoeficientContext ctx);
}