package org.Lexer;

public class Token {
    public static final Token EOF = new Token("EOF");
    public static final Token EPS = new Token("EPS");
    private final String name;
    private final boolean isNonTerminal;

    public Token(String name, boolean isNonTerminal) {
        this.name = name;
        this.isNonTerminal = isNonTerminal;
    }

    public Token(String name) {
        this(name, false);
    }

    public String getName() {
        return name;
    }

    public boolean isTerminal() {
        return !isNonTerminal;
    }
}
