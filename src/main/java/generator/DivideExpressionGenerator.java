package generator;

import ast.DivideExpression;
import ast.Expression;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.MethodVisitor;

public class DivideExpressionGenerator {
    private ExpressionGenerator generator;
    private MethodVisitor methodVisitor;

    public DivideExpressionGenerator(ExpressionGenerator generator, MethodVisitor methodVisitor) {
        this.generator = generator;
        this.methodVisitor = methodVisitor;
    }

    public void generate(DivideExpression expression) {
        Expression left = expression.getLeft();
        left.accept(generator);
        Expression right = expression.getRight();
        right.accept(generator);

        methodVisitor.visitInsn(Opcodes.IDIV);
    }
}
