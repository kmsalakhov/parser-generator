package org.Util;

import org.Lexer.Token;

import java.util.*;

public class GrammarAnalyzer {
    private final Map<Token, Set<Token>> first = new HashMap<>();
    private final Map<Token, Set<Token>> follow = new HashMap<>();
    private final List<Rule> rules;

    public GrammarAnalyzer(List<Rule> rules) {
        this.rules = rules;
        countFirst();
    }

    private Set<Token> countFirst(List<Token> alpha) {
        if (alpha.isEmpty()) {
            return Set.of(Token.EPS);
        }

        if (alpha.get(0).isTerminal()) {
            return Set.of(alpha.get(0));
        }

        var firstA = first.get(alpha.get(0));
        var answer = new HashSet<>(firstA);
        answer.remove(Token.EPS);

        if (firstA.contains(Token.EPS)) {
            answer.addAll(countFirst(alpha.subList(1, alpha.size())));
        }

        return answer;
    }

    private void countFirst() {
        boolean change = true;

        for (Rule rule : rules) {
            if (!first.containsKey(rule.getLeft())) {
                first.put(rule.getLeft(), new HashSet<>());
            }
        }

        if (!rules.isEmpty()) {
            first.get(rules.get(0).getLeft()).add(Token.EPS);
        }

        while (change) {
            change = false;
            for (Rule rule : rules) {
                change |= first.get(rule.getLeft()).addAll(countFirst(rule.getRight()));
            }
        }
    }
}
