package ast;

import generator.ExpressionGenerator;

public class Value implements Expression {
    private String value;

    public Value(String value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    public String getValue() {
        return value;
    }
}
