package ast;

import generator.ExpressionGenerator;

public class MultiplyExpression extends ArithmeticExpression {
    public MultiplyExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
