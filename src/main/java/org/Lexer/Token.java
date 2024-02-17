package org.Lexer;

public class Token {
    public static final Token EOF = new Token("EOF");
    public static final Token EPS = new Token("EPS");
    public static final Token DOLLAR = new Token("DOLLAR");
    private final String name;

    public Token(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTerminal() {
        return Character.isUpperCase(name.charAt(0));
    }
}
