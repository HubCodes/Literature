import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceFilePath = "/home/hub/workspace/Literature/src/main/resources/test.li";
        CharStream sourceCode = new ANTLRFileStream(sourceFilePath);

        byte[] code = Compiler.compile(sourceCode);

        String className = "Main";
        String fileName = className + ".class";
        OutputStream os = new FileOutputStream(fileName);
        os.write(code);
    }
}
