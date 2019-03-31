package generator;

import ast.*;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.MethodVisitor;

public class ExpressionGenerator {
    private ValueExpressionGenerator valueExpressionGenerator;
    private MethodVisitor visitor;

    public ExpressionGenerator(MethodVisitor methodVisitor) {
        visitor = methodVisitor;
        valueExpressionGenerator = new ValueExpressionGenerator(this, methodVisitor);
    }

    public void generate(Value expression) {
        valueExpressionGenerator.generate(expression);
    }

    public void generate(MultiplyExpression expression) {
        acceptLeftAndRight(expression);
        visitor.visitInsn(Opcodes.IMUL);
    }

    public void generate(DivideExpression expression) {
        acceptLeftAndRight(expression);
        visitor.visitInsn(Opcodes.IDIV);
    }

    public void generate(AddExpression expression) {
        acceptLeftAndRight(expression);
        visitor.visitInsn(Opcodes.IADD);
    }

    public void generate(SubtractExpression expression) {
        acceptLeftAndRight(expression);
        visitor.visitInsn(Opcodes.ISUB);
    }

    private void acceptLeftAndRight(ArithmeticExpression expression) {
        Expression left = expression.getLeft();
        Expression right = expression.getRight();
        left.accept(this);
        right.accept(this);
    }
}
