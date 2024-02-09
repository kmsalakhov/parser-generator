package org.Lexer;

import java.util.regex.Pattern;

public class Lexeme {
    private final String name;
    private final Pattern pattern;
    public Lexeme(String name, String regexp) {
        this.name = name;
        this.pattern = Pattern.compile(regexp);
    }

    public boolean satisfy(String s) {
        return pattern.asMatchPredicate().test(s);
    }

    Token getToken() {
        return name;
    }
}
