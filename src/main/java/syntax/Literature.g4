grammar Literature;

@header {
package syntax;
}

// Parser
compilationUnit: expression EOF ;
expression: expression op='*' expression #MultiplyExpression
          | expression op='/' expression #DivideExpression
          | expression op='+' expression #AddExpression
          | expression op='-' expression #SubtractExpression
          | value #ValueExpression ;
value: NUMBER ;
// Lexer
NUMBER: [0-9]+ ;
WS: [ \t\n\r] -> skip ;