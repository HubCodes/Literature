package parser;

import ast.*;
import syntax.LiteratureBaseVisitor;

import static syntax.LiteratureParser.*;

public class ArithmeticExpressionVisitor extends LiteratureBaseVisitor<ArithmeticExpression> {
    private ExpressionVisitor expressionVisitor;

    public ArithmeticExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ArithmeticExpression visitMultiplyExpression(MultiplyExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        Expression leftExpression = left.accept(expressionVisitor);
        Expression rightExpression = right.accept(expressionVisitor);

        return new MultiplyExpression(leftExpression, rightExpression);
    }

    @Override
    public ArithmeticExpression visitDivideExpression(DivideExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        Expression leftExpression = left.accept(expressionVisitor);
        Expression rightExpression = right.accept(expressionVisitor);

        return new DivideExpression(leftExpression, rightExpression);
    }

    @Override
    public ArithmeticExpression visitAddExpression(AddExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        Expression leftExpression = left.accept(expressionVisitor);
        Expression rightExpression = right.accept(expressionVisitor);

        return new AddExpression(leftExpression, rightExpression);
    }

    @Override
    public ArithmeticExpression visitSubtractExpression(SubtractExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        Expression leftExpression = left.accept(expressionVisitor);
        Expression rightExpression = right.accept(expressionVisitor);

        return new SubtractExpression(leftExpression, rightExpression);
    }
}
