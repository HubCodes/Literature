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
    public Expression visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitMultiplicativeExpression(ctx);
    }

    @Override
    public Expression visitAdditiveExpression(AdditiveExpressionContext ctx) {
        return arithmeticExpressionVisitor.visitAdditiveExpression(ctx);
    }
}
