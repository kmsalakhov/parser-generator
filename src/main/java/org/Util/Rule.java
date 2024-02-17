package org.Util;

import org.Lexer.Token;

import java.util.List;

public class Rule {
    private Token left;
    private List<Token> right;

    public Rule(Token left, List<Token> right) {
        this.left = left;
        this.right = right;
    }

    public Token getLeft() {
        return left;
    }

    public List<Token> getRight() {
        return right;
    }
}
