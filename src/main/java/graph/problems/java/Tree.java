package graph.problems.java;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public T value;
    public List<Tree<T>> children;

    public Tree(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Tree<T> of(T value) {
        return new Tree<>(value);
    }

    public Tree<T> addChild(T value) {
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }

    public Tree<T> dfs(T value) {
        if (this.value == value) { return this; }
        return null;
    }
}
