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

    public static <T> Node<T> search(T value, Node<T> node, AlgorithmType algorithm) {
        var found = new LinkedList<Node<T>>();
        switch (algorithm) {
            case DFS:
                DFS.search(value, node, found);
            default:
                break;
        }
        return found.get(0);
    }
}
