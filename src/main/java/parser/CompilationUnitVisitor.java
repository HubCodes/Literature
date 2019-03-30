package parser;

import ast.CompilationUnit;
import ast.Expression;
import syntax.LiteratureBaseVisitor;
import syntax.LiteratureParser;

import static syntax.LiteratureParser.ExpressionContext;

public class CompilationUnitVisitor extends LiteratureBaseVisitor<CompilationUnit> {
    @Override
    public CompilationUnit visitCompilationUnit(LiteratureParser.CompilationUnitContext ctx) {
        ExpressionContext context = ctx.expression();
        Expression expression = context.accept(new ExpressionVisitor());

        return new CompilationUnit(expression);
    }
}
