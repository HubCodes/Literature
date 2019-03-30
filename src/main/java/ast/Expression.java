package ast;

import generator.ExpressionGenerator;

public interface Expression {
    void accept(ExpressionGenerator generator);
}
