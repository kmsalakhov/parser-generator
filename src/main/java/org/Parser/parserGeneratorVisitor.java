// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;

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
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_rule_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule_init(parserGeneratorParser.Parse_rule_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule(parserGeneratorParser.Parse_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_rule_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule_arg(parserGeneratorParser.Parse_rule_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#parse_rule_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule_call(parserGeneratorParser.Parse_rule_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#pass_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_variables(parserGeneratorParser.Pass_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variables_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variables_in(parserGeneratorParser.Init_variables_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variable_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variable_in(parserGeneratorParser.Init_variable_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variables_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variables_out(parserGeneratorParser.Init_variables_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserGeneratorParser#init_variable_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_variable_out(parserGeneratorParser.Init_variable_outContext ctx);
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