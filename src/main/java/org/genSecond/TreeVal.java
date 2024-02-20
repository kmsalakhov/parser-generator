package org.genSecond;

public class TreeVal<T> {
    private final T res;
    private final Tree tree;

    public TreeVal(T res, Tree tree) {
        this.res = res;
        this.tree = tree;
    }

    public T getRes() {
        return res;
    }

    public Tree getTree() {
        return tree;
    }
}
