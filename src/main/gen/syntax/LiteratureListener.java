// Generated from /home/hub/workspace/Literature/src/main/java/syntax/Literature.g4 by ANTLR 4.7.2
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LiteratureParser}.
 */
public interface LiteratureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(LiteratureParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(LiteratureParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(LiteratureParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(LiteratureParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(LiteratureParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(LiteratureParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(LiteratureParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(LiteratureParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(LiteratureParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(LiteratureParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LiteratureParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LiteratureParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LiteratureParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LiteratureParser.ValueContext ctx);
}