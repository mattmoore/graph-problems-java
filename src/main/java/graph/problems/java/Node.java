package graph.problems.java;

import java.util.*;

public class Node<T> {
    public T value;
    public List<Node<T>> children;

    public Node(T value) {
        this.value = value;
        this.children = new LinkedList<>();
    }

    public static <T> Node<T> of(T value) {
        return new Node<>(value);
    }

    public Node<T> addChild(T value) {
        Node<T> newChild = new Node<>(value);
        children.add(newChild);
        return newChild;
    }

    public static <T> Node<T> search(T value, Node<T> node) {
        var found = new LinkedList<Node<T>>();
        dfs(value, node, found);
        return found.get(0);
    }

    public static <T> void dfs(T value, Node<T> node, List<Node<T>> found) {
        if (node == null) return;
        if (node.value == value) {
            System.out.println("Found it: " + node.value);
            found.add(node);
        }
        for (Node<T> child : node.children) {
            dfs(value, child, found);
        }
    }
}
