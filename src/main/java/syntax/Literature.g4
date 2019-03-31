grammar Literature;

@header {
package syntax;
}

// Parser
compilationUnit: expression EOF ;
expression: expression op = ( MULTIPLY | DIVIDE ) expression #MultiplicativeExpression
          | expression op = ( ADD | SUBTRACT ) expression #AdditiveExpression
          | primaryExpression #PrimExpression ;
primaryExpression: value #ValueExpression
                 | '(' expression ')' #NestedExpression ;
value: NUMBER ;

// Lexer
MULTIPLY: '*' ;
DIVIDE: '/' ;
ADD: '+' ;
SUBTRACT: '-' ;
NUMBER: [0-9]+ ;
WS: [ \t\n\r] -> skip ;