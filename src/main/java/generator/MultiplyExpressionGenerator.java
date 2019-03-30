package generator;

import ast.Expression;
import ast.MultiplyExpression;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.MethodVisitor;

public class MultiplyExpressionGenerator {
    private ExpressionGenerator generator;
    private MethodVisitor methodVisitor;

    public MultiplyExpressionGenerator(ExpressionGenerator generator, MethodVisitor methodVisitor) {
        this.generator = generator;
        this.methodVisitor = methodVisitor;
    }

    public void generate(MultiplyExpression expression) {
        Expression left = expression.getLeft();
        left.accept(generator);
        Expression right = expression.getRight();
        right.accept(generator);

        methodVisitor.visitInsn(Opcodes.IMUL);
    }
}
