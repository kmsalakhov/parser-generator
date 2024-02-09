grammar parserGenerator;

@header {
package org.example;
}

grm: rule+ EOF;

rule: parse_rule | lexer_rule;

//parse_rule: PARSE_NAME ':' (parse_rule_arg+ '|')* parse_rule_arg+ ';';
parse_rule: PARSE_NAME ':' parse_expression ';';
parse_expression: parse_factor+ ('|' parse_factor+)*;
parse_factor: parse_primitive | '(' parse_expression ')' | parse_factor operation;
parse_primitive: STRING | LEXER_NAME | PARSE_NAME;

lexer_rule: LEXER_NAME ':' lexer_expression ';';
lexer_expression: lexer_factor+ ('|' lexer_factor+)*;
lexer_factor: lexer_primitive | '(' lexer_expression ')' | lexer_factor operation;
lexer_primitive: STRING | LEXER_NAME;

//lexer_rule: LEXER_NAME ':' (lexer_rule_arg+ '|')* lexer_rule_arg+ ';';
//lexer_rule_arg: STRING | LEXER_NAME | '(' lexer_rule_arg ')' | lexer_rule_arg operation;
//parse_rule_arg: lexer_rule_arg | PARSE_NAME | '(' parse_rule_arg ')' | parse_rule_arg operation;
operation: PLUS | MUL;


QUOT: '\'';
PARSE_NAME: [a-z] [a-zA-Z_0-9]*;
LEXER_NAME: [A-Z] [a-zA-Z_0-9]*;
COMMENT: '//' (~'\n')* '\n' -> skip;
STRING: QUOT ~('\'') QUOT;
PLUS: '+';
MUL: '*';

ID: [a-zA-Z]+;
INT: [0-9]+;

WS: [ \t\r\n]+ -> skip;


