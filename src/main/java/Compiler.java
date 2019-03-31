import ast.CompilationUnit;
import generator.CompilationUnitGenerator;
import org.antlr.v4.runtime.CharStream;
import parser.Parser;

class Compiler {
    static byte[] compile(CharStream sourceCode) {
        CompilationUnit astRoot = getCompilationUnit(new Parser(), sourceCode);
        byte[] jvmCode = getJvmCode(new CompilationUnitGenerator(), astRoot);

        return jvmCode;
    }

    private static CompilationUnit getCompilationUnit(Parser parser, CharStream sourceCode) {
        return parser.getCompilationUnit(sourceCode);
    }

    private static byte[] getJvmCode(CompilationUnitGenerator generator, CompilationUnit astRoot) {
        return generator.generate(astRoot);
    }
}
