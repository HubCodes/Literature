package ast;

public class CompilationUnit {
    private Expression expression;

    public CompilationUnit(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
