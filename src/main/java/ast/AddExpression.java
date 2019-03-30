package ast;

import generator.ExpressionGenerator;

public class AddExpression extends ArithmeticExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
