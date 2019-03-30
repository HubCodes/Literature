package ast;

import generator.ExpressionGenerator;

public class SubtractExpression extends ArithmeticExpression {
    public SubtractExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
