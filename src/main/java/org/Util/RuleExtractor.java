package org.Util;

import org.Lexer.Token;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RuleExtractor {
    private final List<Rule> rules = new ArrayList<>();
    public RuleExtractor(Reader reader) {
        extractRules(new BufferedReader(reader));
    }

    private void extractRules(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                int barrier = line.indexOf(':');
                Token token = new Token(line.substring(0, barrier));
                String alpha = line.substring(barrier + 1);
                List<Token> tokens  = Arrays.stream(alpha.split(" ")).map(Token::new).toList();
                rules.add(new Rule(token, tokens));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Rule> getRules() {
        return rules;
    }
}
