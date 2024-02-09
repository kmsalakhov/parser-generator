// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org.example/parserGenerator.g4 by ANTLR 4.13.1

package org.example;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserGeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserGeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#grm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrm(parserGeneratorParser.GrmContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(parserGeneratorParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule(parserGeneratorParser.Parse_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_expression(parserGeneratorParser.Parse_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_factor(parserGeneratorParser.Parse_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_primitive(parserGeneratorParser.Parse_primitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#lexer_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_rule(parserGeneratorParser.Lexer_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#lexer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_expression(parserGeneratorParser.Lexer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#lexer_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_factor(parserGeneratorParser.Lexer_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#lexer_primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_primitive(parserGeneratorParser.Lexer_primitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(parserGeneratorParser.OperationContext ctx);
}