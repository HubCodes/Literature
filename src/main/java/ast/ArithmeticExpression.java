package ast;

import generator.ExpressionGenerator;

public abstract class ArithmeticExpression implements Expression {
    private Expression left;
    private Expression right;

    public ArithmeticExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public abstract void accept(ExpressionGenerator generator);
}
