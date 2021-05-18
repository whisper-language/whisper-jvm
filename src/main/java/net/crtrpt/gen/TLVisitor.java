// Generated from D:/private/asm/src/main/antlr\TL.g4 by ANTLR 4.9.1
package net.crtrpt.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code buildInIdentifierFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInIdentifierFunctionCall(TLParser.BuildInIdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(TLParser.IdentifierFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnFunctionCall(TLParser.PrintlnFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(TLParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertFunctionCall(TLParser.AssertFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link TLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeFunctionCall(TLParser.SizeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(TLParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(TLParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(TLParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(TLParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(TLParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(TLParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(TLParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(TLParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(TLParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(TLParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(TLParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(TLParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(TLParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(TLParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(TLParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(TLParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(TLParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(TLParser.ExpressionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(TLParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(TLParser.CompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(TLParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(TLParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(TLParser.MultExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(TLParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(TLParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(TLParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(TLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(TLParser.IndexesContext ctx);
}