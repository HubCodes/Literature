package parser;

import ast.*;
import syntax.LiteratureBaseVisitor;
import syntax.LiteratureLexer;

import static syntax.LiteratureParser.*;

public class ArithmeticExpressionVisitor extends LiteratureBaseVisitor<ArithmeticExpression> {
    private ExpressionVisitor expressionVisitor;

    public ArithmeticExpressionVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public ArithmeticExpression visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case LiteratureLexer.MULTIPLY:
                return visitMultiplyExpression(ctx);
            case LiteratureLexer.DIVIDE:
                return visitDivideExpression(ctx);
        }

        return null;
    }

    @Override
    public ArithmeticExpression visitAdditiveExpression(AdditiveExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case LiteratureLexer.ADD:
                return visitAddExpression(ctx);
            case LiteratureLexer.SUBTRACT:
                return visitSubtractExpression(ctx);
        }

        return null;
    }

    private ArithmeticExpression visitMultiplyExpression(MultiplicativeExpressionContext ctx) {
        TwoExpressions children = visitChildren(ctx);

        return new MultiplyExpression(children.getLeft(), children.getRight());
    }

    private ArithmeticExpression visitDivideExpression(MultiplicativeExpressionContext ctx) {
        TwoExpressions children = visitChildren(ctx);

        return new DivideExpression(children.getLeft(), children.getRight());
    }

    private ArithmeticExpression visitAddExpression(AdditiveExpressionContext ctx) {
        TwoExpressions children = visitChildren(ctx);

        return new AddExpression(children.getLeft(), children.getRight());
    }

    private ArithmeticExpression visitSubtractExpression(AdditiveExpressionContext ctx) {
        TwoExpressions children = visitChildren(ctx);

        return new SubtractExpression(children.getLeft(), children.getRight());
    }

    private TwoExpressions visitChildren(MultiplicativeExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        return makeTwoExpressionsFromExpressionContext(left, right);
    }

    private TwoExpressions visitChildren(AdditiveExpressionContext ctx) {
        ExpressionContext left = ctx.expression(0);
        ExpressionContext right = ctx.expression(1);

        return makeTwoExpressionsFromExpressionContext(left, right);
    }

    private TwoExpressions makeTwoExpressionsFromExpressionContext(ExpressionContext left, ExpressionContext right) {
        Expression leftExpression = left.accept(expressionVisitor);
        Expression rightExpression = right.accept(expressionVisitor);

        return new TwoExpressions(leftExpression, rightExpression);
    }
}
