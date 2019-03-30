package ast;

import generator.ExpressionGenerator;

public class DivideExpression extends ArithmeticExpression {
    public DivideExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
