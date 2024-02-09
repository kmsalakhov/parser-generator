// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org.example/parserGenerator.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parserGeneratorParser}.
 */
public interface parserGeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#grm}.
	 * @param ctx the parse tree
	 */
	void enterGrm(parserGeneratorParser.GrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#grm}.
	 * @param ctx the parse tree
	 */
	void exitGrm(parserGeneratorParser.GrmContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(parserGeneratorParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(parserGeneratorParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule(parserGeneratorParser.Parse_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule(parserGeneratorParser.Parse_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_expression}.
	 * @param ctx the parse tree
	 */
	void enterParse_expression(parserGeneratorParser.Parse_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_expression}.
	 * @param ctx the parse tree
	 */
	void exitParse_expression(parserGeneratorParser.Parse_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_factor}.
	 * @param ctx the parse tree
	 */
	void enterParse_factor(parserGeneratorParser.Parse_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_factor}.
	 * @param ctx the parse tree
	 */
	void exitParse_factor(parserGeneratorParser.Parse_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_primitive}.
	 * @param ctx the parse tree
	 */
	void enterParse_primitive(parserGeneratorParser.Parse_primitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_primitive}.
	 * @param ctx the parse tree
	 */
	void exitParse_primitive(parserGeneratorParser.Parse_primitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void enterLexer_rule(parserGeneratorParser.Lexer_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void exitLexer_rule(parserGeneratorParser.Lexer_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#lexer_expression}.
	 * @param ctx the parse tree
	 */
	void enterLexer_expression(parserGeneratorParser.Lexer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#lexer_expression}.
	 * @param ctx the parse tree
	 */
	void exitLexer_expression(parserGeneratorParser.Lexer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#lexer_factor}.
	 * @param ctx the parse tree
	 */
	void enterLexer_factor(parserGeneratorParser.Lexer_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#lexer_factor}.
	 * @param ctx the parse tree
	 */
	void exitLexer_factor(parserGeneratorParser.Lexer_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#lexer_primitive}.
	 * @param ctx the parse tree
	 */
	void enterLexer_primitive(parserGeneratorParser.Lexer_primitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#lexer_primitive}.
	 * @param ctx the parse tree
	 */
	void exitLexer_primitive(parserGeneratorParser.Lexer_primitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(parserGeneratorParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(parserGeneratorParser.OperationContext ctx);
}