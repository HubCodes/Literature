// Generated from /home/hub/workspace/Literature/src/main/java/syntax/Literature.g4 by ANTLR 4.7.2
package syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LiteratureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LiteratureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(LiteratureParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(LiteratureParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(LiteratureParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(LiteratureParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyExpression}
	 * labeled alternative in {@link LiteratureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(LiteratureParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LiteratureParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(LiteratureParser.ValueContext ctx);
}