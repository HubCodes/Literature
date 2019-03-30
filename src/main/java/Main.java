import ast.CompilationUnit;
import generator.CompilationUnitGenerator;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import parser.Parser;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceFilePath = "/home/hub/workspace/Literature/src/main/resources/test.li";
        Parser parser = new Parser();
        CharStream sourceCode = new ANTLRFileStream(sourceFilePath);

        CompilationUnit root = parser.getCompilationUnit(sourceCode);

        byte[] code = new CompilationUnitGenerator().generate(root);
        String className = "Main";
        String fileName = className + ".class";
        OutputStream os = new FileOutputStream(fileName);
        os.write(code);
    }
}
