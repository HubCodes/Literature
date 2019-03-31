package parser;

import ast.Expression;
import ast.Value;
import syntax.LiteratureBaseVisitor;

import static syntax.LiteratureParser.*;

public class PrimaryExpressionVisitor extends LiteratureBaseVisitor<Expression> {
    private ExpressionVisitor visitor;

    public PrimaryExpressionVisitor(ExpressionVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public Expression visitValueExpression(ValueExpressionContext ctx) {
        return visitValue(ctx.value());
    }

    @Override
    public Expression visitNestedExpression(NestedExpressionContext ctx) {
        return ctx.expression().accept(visitor);
    }

    @Override
    public Expression visitValue(ValueContext ctx) {
        return new Value(ctx.getText());
    }

}
