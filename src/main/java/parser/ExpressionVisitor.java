package parser;

import ast.Expression;
import syntax.LiteratureBaseVisitor;

import static syntax.LiteratureParser.*;

public class ExpressionVisitor extends LiteratureBaseVisitor<Expression> {
    private ArithmeticExpressionVisitor arithmeticExpressionVisitor;
    private PrimaryExpressionVisitor primaryExpressionVisitor;

    public ExpressionVisitor() {
        arithmeticExpressionVisitor = new ArithmeticExpressionVisitor(this);
        primaryExpressionVisitor = new PrimaryExpressionVisitor(this);
    }

    @Override
    public Expression visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Expression visitAdditiveExpression(AdditiveExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitAdditiveExpression(ctx);
    }

    @Override
    public Expression visitPrimExpression(PrimExpressionContext ctx) {
        return primaryExpressionVisitor.visitPrimExpression(ctx);
    }
}
