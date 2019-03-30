package parser;

import ast.CompilationUnit;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import syntax.LiteratureLexer;
import syntax.LiteratureParser;

public class Parser {
    public CompilationUnit getCompilationUnit(CharStream sourceCode) {
        LiteratureLexer lexer = new LiteratureLexer(sourceCode);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        LiteratureParser parser = new LiteratureParser(stream);

        return parser.compilationUnit().accept(new CompilationUnitVisitor());
    }
}
