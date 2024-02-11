// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_atom(parserGeneratorParser.Parse_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_primitive(parserGeneratorParser.Parse_primitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variables(parserGeneratorParser.Init_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variable(parserGeneratorParser.Init_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(parserGeneratorParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(parserGeneratorParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(parserGeneratorParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(parserGeneratorParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#lexer_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_rule(parserGeneratorParser.Lexer_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(parserGeneratorParser.OperationContext ctx);
}