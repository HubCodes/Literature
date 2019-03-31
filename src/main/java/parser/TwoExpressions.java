package parser;

import ast.Expression;

public class TwoExpressions {
    private Expression left;
    private Expression right;

    public TwoExpressions(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
