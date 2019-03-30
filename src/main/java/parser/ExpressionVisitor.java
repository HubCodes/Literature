package parser;

import ast.Expression;
import ast.Value;
import syntax.LiteratureBaseVisitor;

import static syntax.LiteratureParser.*;

public class ExpressionVisitor extends LiteratureBaseVisitor<Expression> {
    private ArithmeticExpressionVisitor arithmeticExpressionVisitor;

    public ExpressionVisitor() {
        this.arithmeticExpressionVisitor = new ArithmeticExpressionVisitor(this);
    }

    @Override
    public Expression visitValue(ValueContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Expression visitMultiplyExpression(MultiplyExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitMultiplyExpression(ctx);
    }

    @Override
    public Expression visitDivideExpression(DivideExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitDivideExpression(ctx);
    }

    @Override
    public Expression visitAddExpression(AddExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitAddExpression(ctx);
    }

    @Override
    public Expression visitSubtractExpression(SubtractExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitSubtractExpression(ctx);
    }
}
