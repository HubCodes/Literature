package generator;

import ast.Value;
import org.objectweb.asm.MethodVisitor;

public class ValueExpressionGenerator {
    private ExpressionGenerator generator;
    private MethodVisitor visitor;

    public ValueExpressionGenerator(ExpressionGenerator generator, MethodVisitor visitor) {
        this.generator = generator;
        this.visitor = visitor;
    }

    public void generate(Value value) {
        String realValue = value.getValue();
        visitor.visitLdcInsn(Integer.parseInt(realValue));
    }
}
