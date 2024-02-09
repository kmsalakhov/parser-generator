package org.Lexer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TokenLexer implements Lexer<Token> {
    private static final Token EOF = new Token("EOF");
    private static final String LEXEMES_FILE = "Lexemes.txt";
    private final Reader reader;
    private final StringBuilder stack = new StringBuilder();
    private Token token;

    private final List<Lexeme> lexemes = new ArrayList<>();

    public TokenLexer(Reader reader) throws IOException {
        this.reader = reader;
        nextToken();
        prepareLexemes();
    }

    private void prepareLexemes() {
        try (BufferedReader in = new BufferedReader(new FileReader(LEXEMES_FILE))) {
            String line;
            while ((line = in.readLine()) != null) {
                int barrier = line.indexOf(':');
                String lexemaName = line.substring(0, barrier);
                String lexemaRule = line.substring(barrier + 1, line.length());
                lexemes.add(new Lexeme(lexemaName, lexemaRule));
            }
        } catch (FileNotFoundException e) {
            System.err.println();
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void nextToken() throws IOException {
        int c;
        while ((c = reader.read()) != -1 && satisfyAny((char) c)) {
            stack.append(c);
        }

        if (stack.isEmpty()) {
            token = EOF;
            return;
        }

        token = lexemes.stream().filter(l -> l.satisfy(stack.toString())).
                findFirst().orElseThrow().getToken();

        stack.delete(0, stack.length());

        if (c != -1) {
            stack.append(c);
        }
    }

    public boolean satisfyAny(char c) {
        return lexemes.stream().anyMatch(l -> l.satisfy(stack.toString() + c));
    }

    @Override
    public Token getToken() {
        return token;
    }
}
