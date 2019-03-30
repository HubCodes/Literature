package generator;

import ast.*;
import org.objectweb.asm.MethodVisitor;

public class ExpressionGenerator {
    private ValueExpressionGenerator valueExpressionGenerator;
    private MultiplyExpressionGenerator multiplyExpressionGenerator;
    private DivideExpressionGenerator divideExpressionGenerator;
    private AddExpressionGenerator addExpressionGenerator;
    private SubtractExpressionGenerator subtractExpressionGenerator;

    public ExpressionGenerator(MethodVisitor methodVisitor) {
        valueExpressionGenerator = new ValueExpressionGenerator(this, methodVisitor);
        multiplyExpressionGenerator = new MultiplyExpressionGenerator(this, methodVisitor);
        divideExpressionGenerator = new DivideExpressionGenerator(this, methodVisitor);
        addExpressionGenerator = new AddExpressionGenerator(this, methodVisitor);
        subtractExpressionGenerator = new SubtractExpressionGenerator(this, methodVisitor);
    }

    public void generate(Expression expression) {
        if (expression instanceof Value) {
            generate((Value) expression);
        } else if (expression instanceof MultiplyExpression) {
            generate((MultiplyExpression) expression);
        } else if (expression instanceof DivideExpression) {
            generate((DivideExpression) expression);
        } else if (expression instanceof AddExpression) {
            generate((AddExpression) expression);
        } else if (expression instanceof SubtractExpression) {
            generate((SubtractExpression) expression);
        }
    }

    public void generate(Value expression) {
        valueExpressionGenerator.generate(expression);
    }

    public void generate(MultiplyExpression expression) {
        multiplyExpressionGenerator.generate(expression);
    }

    public void generate(DivideExpression expression) {
        divideExpressionGenerator.generate(expression);
    }

    public void generate(AddExpression expression) {
        addExpressionGenerator.generate(expression);
    }

    public void generate(SubtractExpression expression) {
        subtractExpressionGenerator.generate(expression);
    }
}
