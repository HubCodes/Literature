package generator;

import ast.CompilationUnit;
import ast.Expression;

public class CompilationUnitGenerator {
    public byte[] generate(CompilationUnit compilationUnit) {
        Expression expression = compilationUnit.getExpression();
        ClassGenerator generator = new ClassGenerator();
        
        return generator.generate(expression).toByteArray();
    }
}
