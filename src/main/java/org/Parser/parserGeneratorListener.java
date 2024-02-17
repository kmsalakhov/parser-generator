// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;

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
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_rule_init}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule_init(parserGeneratorParser.Parse_rule_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_rule_init}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule_init(parserGeneratorParser.Parse_rule_initContext ctx);
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
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_rule_arg}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule_arg(parserGeneratorParser.Parse_rule_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_rule_arg}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule_arg(parserGeneratorParser.Parse_rule_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#parse_rule_call}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule_call(parserGeneratorParser.Parse_rule_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#parse_rule_call}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule_call(parserGeneratorParser.Parse_rule_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#pass_variables}.
	 * @param ctx the parse tree
	 */
	void enterPass_variables(parserGeneratorParser.Pass_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#pass_variables}.
	 * @param ctx the parse tree
	 */
	void exitPass_variables(parserGeneratorParser.Pass_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#init_variables_in}.
	 * @param ctx the parse tree
	 */
	void enterInit_variables_in(parserGeneratorParser.Init_variables_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#init_variables_in}.
	 * @param ctx the parse tree
	 */
	void exitInit_variables_in(parserGeneratorParser.Init_variables_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#init_variable_in}.
	 * @param ctx the parse tree
	 */
	void enterInit_variable_in(parserGeneratorParser.Init_variable_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#init_variable_in}.
	 * @param ctx the parse tree
	 */
	void exitInit_variable_in(parserGeneratorParser.Init_variable_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#init_variables_out}.
	 * @param ctx the parse tree
	 */
	void enterInit_variables_out(parserGeneratorParser.Init_variables_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#init_variables_out}.
	 * @param ctx the parse tree
	 */
	void exitInit_variables_out(parserGeneratorParser.Init_variables_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#init_variable_out}.
	 * @param ctx the parse tree
	 */
	void enterInit_variable_out(parserGeneratorParser.Init_variable_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#init_variable_out}.
	 * @param ctx the parse tree
	 */
	void exitInit_variable_out(parserGeneratorParser.Init_variable_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(parserGeneratorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(parserGeneratorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(parserGeneratorParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(parserGeneratorParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserGeneratorParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(parserGeneratorParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserGeneratorParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(parserGeneratorParser.CodeContext ctx);
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