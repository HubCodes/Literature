package generator;

import ast.Expression;
import ast.SubtractExpression;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.objectweb.asm.MethodVisitor;

public class SubtractExpressionGenerator {
    private ExpressionGenerator generator;
    private MethodVisitor visitor;

    public SubtractExpressionGenerator(ExpressionGenerator generator, MethodVisitor visitor) {
        this.generator = generator;
        this.visitor = visitor;
    }

    public void generate(SubtractExpression expression) {
        Expression left = expression.getLeft();
        Expression right = expression.getRight();
        left.accept(generator);
        right.accept(generator);

        visitor.visitInsn(Opcodes.ISUB);
    }
}
