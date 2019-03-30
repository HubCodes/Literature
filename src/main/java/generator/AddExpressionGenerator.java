package generator;

import ast.AddExpression;
import ast.Expression;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class AddExpressionGenerator {
    private ExpressionGenerator generator;
    private MethodVisitor visitor;

    public AddExpressionGenerator(ExpressionGenerator generator, MethodVisitor visitor) {
        this.generator = generator;
        this.visitor = visitor;
    }

    public void generate(AddExpression expression) {
        Expression left = expression.getLeft();
        Expression right = expression.getRight();
        left.accept(generator);
        right.accept(generator);

        visitor.visitInsn(Opcodes.IADD);
    }
}
