// Generated from Literature.g4 by ANTLR 4.5

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
     * Visit a parse tree produced by {@link LiteratureParser#compilationUnit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompilationUnit(LiteratureParser.CompilationUnitContext ctx);

    /**
     * Visit a parse tree produced by the {@code AdditiveExpression}
     * labeled alternative in {@link LiteratureParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdditiveExpression(LiteratureParser.AdditiveExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code PrimExpression}
     * labeled alternative in {@link LiteratureParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrimExpression(LiteratureParser.PrimExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code MultiplicativeExpression}
     * labeled alternative in {@link LiteratureParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiplicativeExpression(LiteratureParser.MultiplicativeExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code ValueExpression}
     * labeled alternative in {@link LiteratureParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValueExpression(LiteratureParser.ValueExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code NestedExpression}
     * labeled alternative in {@link LiteratureParser#primaryExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNestedExpression(LiteratureParser.NestedExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link LiteratureParser#value}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue(LiteratureParser.ValueContext ctx);
}