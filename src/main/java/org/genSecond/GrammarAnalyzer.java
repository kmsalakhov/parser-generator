package org.genSecond;

import java.util.*;

public class GrammarAnalyzer {
    private final Map<Token, Set<Token>> first = new HashMap<>();
    private final Map<Token, Set<Token>> follow = new HashMap<>();
    private final List<Rule> rules;

    public GrammarAnalyzer(List<Rule> rules) {
        this.rules = rules;
        countFirst();
        countFollow();
    }

    public Set<Token> countFirst1(List<Token> alpha) {
        var firsts = countFirst(alpha);
        if (firsts.contains(Token.EPS) || firsts.contains(Token.EMPTY)) {
            firsts.remove(Token.EPS);
            firsts.remove(Token.EMPTY);
            firsts.addAll(follow.get(alpha.get(0)));
        }
        return firsts;
    }

    public Set<Token> countFirst(List<Token> alpha) {
        if (alpha.isEmpty()) {
            return new HashSet<>(Set.of(Token.EPS));
        }

        if (alpha.get(0).isTerminal()) {
            return new HashSet<>(Set.of(alpha.get(0)));
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

        initSets(first);

        while (change) {
            change = false;
            for (Rule rule : rules) {
                change |= first.get(rule.getLeft()).addAll(countFirst(rule.getRight()));
            }
        }
    }

    private void countFollow() {
        initSets(follow);

        if (!rules.isEmpty()) {
            follow.get(rules.get(0).getLeft()).add(Token.DOLLAR);
        }

        boolean change = true;
        while (change) {
            change = false;
            for (Rule rule : rules) {
                var A  = rule.getLeft();
                var alpha = rule.getRight();
                for (int i = 0; i < alpha.size(); i++) {
                    var B = alpha.get(i);

                    if (!follow.containsKey(B)) {
                        follow.put(B, new HashSet<>());
                    }

                    var gamma = alpha.subList(i + 1, alpha.size());
                    var firstGamma = countFirst(gamma);
                    boolean EPS_inside = firstGamma.remove(Token.EPS);
                    change |= follow.get(B).addAll(firstGamma);
                    if (EPS_inside) {
                        change |= follow.get(B).addAll(follow.get(A));
                    }
                }
            }
        }
    }
    
    private void initSets(Map<Token, Set<Token>> mp) {
        for (Rule rule : rules) {
            if (!mp.containsKey(rule.getLeft())) {
                mp.put(rule.getLeft(), new HashSet<>());
            }
        }
    }
}
