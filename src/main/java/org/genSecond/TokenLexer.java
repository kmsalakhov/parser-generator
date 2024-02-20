package org.genSecond;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.genSecond.Token.EMPTY;

public class TokenLexer implements Lexer<Token> {
    private static final String LEXEMES_FILE = "Lexemes.txt";
    private final Reader reader;
    private final StringBuilder stack = new StringBuilder();
    private Token token;

    private final List<Lexeme> lexemes = new ArrayList<>();

    public TokenLexer(Reader reader) throws IOException {
        this.reader = reader;
        prepareLexemes();
        nextToken();
    }

    private void prepareLexemes() throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(LEXEMES_FILE))) {
            String line;
            while ((line = in.readLine()) != null) {
                int barrier = line.indexOf('[');
                String lexemeName = line.substring(0, barrier - 1);
                String lexemeRule = line.substring(barrier + 1, line.length() - 1);
                lexemes.add(new Lexeme(lexemeName, lexemeRule));
            }
        } catch (FileNotFoundException e) {
            System.err.printf("File not found: %s%n", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void nextToken() throws IOException {
        int c = -1;
        if (!satisfyAny()) {
            while (((c = reader.read()) != -1) && !satisfyAny((char) c)) {
                stack.append((char) c);
            }
        }

        if (c != -1) {
            stack.append((char) c);
        }

        Lexeme lexeme = lexemes.stream().filter(l -> l.satisfy(stack.toString())).findFirst().orElse(null);

        if (lexeme == null) {
            token = EMPTY;
            return;
        }

        while ((c = reader.read()) != -1 && lexeme.satisfy(stack.toString() + (char)c)) {
            stack.append((char) c);
        }

        token = new Token(lexeme.getToken().getName(), stack.toString());

        stack.delete(0, stack.length());

        if (c != -1) {
            stack.append((char) c);
        }
    }

    public boolean satisfyAny(char c) {
        return lexemes.stream().anyMatch(l -> l.satisfy(stack.toString() + (char)c));
    }

    public boolean satisfyAny() {
        return lexemes.stream().anyMatch(l -> l.satisfy(stack.toString()));
    }

    @Override
    public Token getToken() {
        return token;
    }
}
