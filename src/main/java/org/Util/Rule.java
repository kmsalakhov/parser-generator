package org.Util;

import org.Lexer.Token;

import java.util.List;

public class Rule {
    private Token left;
    private List<Token> right;

    public Token getLeft() {
        return left;
    }

    public List<Token> getRight() {
        return right;
    }
}
