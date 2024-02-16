package org.gen;

import java.io.*
import java.util.ArrayList
import java.util.List

public class Parser {
	private final TokenLexer lexer;

	public Parser(Reader reader) {
		lexer = new TokenLexer(reader);
	}

	private assertToken(String tokenName) {
		assert (lexer.getToken() == new Token(tokenName);
	}

    public Tree<parse_rule_out> parse_rule(parse_rule_in in) {
		parse_rule_out out = new parse_rule_out();
		List<Tree> children = new ArrayList<>();
		assertToken(A);
		for (int i = 0; i < n; i++) { int c = 15 + i }
		return new Tree<parse_rule_out>(out, children);
	}

    public Tree<maxim_out> maxim(maxim_in in) {
		maxim_out out = new maxim_out();
		List<Tree> children = new ArrayList<>();
		assertToken(A);
		assertToken(B);
		assertToken(A);
		assertToken(B);
		assertToken(B);
		return new Tree<maxim_out>(out, children);
	}

    public Tree<kamil_out> kamil(kamil_in in) {
		kamil_out out = new kamil_out();
		List<Tree> children = new ArrayList<>();
		assertToken(A);
		assertToken(B);
		assertToken(A);
		assertToken(B);
		assertToken(B);
		return new Tree<kamil_out>(out, children);
	}

    public Tree<ainur_out> ainur(ainur_in in) {
		ainur_out out = new ainur_out();
		List<Tree> children = new ArrayList<>();
		assertToken(A);
		assertToken(B);
		assertToken(A);
		assertToken(B);
		assertToken(B);
		return new Tree<ainur_out>(out, children);
	}

}
