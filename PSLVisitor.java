// Generated from PSL.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link PSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(PSLParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(PSLParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#var_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_id(PSLParser.Var_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id(PSLParser.Type_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PSLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(PSLParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(PSLParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PSLParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#order_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_stmt(PSLParser.Order_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PSLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PSLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#polynomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolynomial(PSLParser.PolynomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#monomial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonomial(PSLParser.MonomialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PSLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PSLParser.SignContext ctx);
}