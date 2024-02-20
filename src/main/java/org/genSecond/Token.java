package org.genSecond;

import java.util.Objects;

public class Token {
    public static final Token EMPTY = new Token("EMPTY");
    public static final Token EOF = new Token("EOF");
    public static final Token EPS = new Token("EPS");
    public static final Token DOLLAR = new Token("DOLLAR");
    private final String name;
    private final String text;

    public Token(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Token(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public boolean isTerminal() {
        return Character.isUpperCase(name.charAt(0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return Objects.equals(name, token.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getText() {
        return text;
    }
}
