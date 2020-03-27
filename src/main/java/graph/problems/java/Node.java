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

//    public static <T> Node<T> search(Node<T> node, T value) {
//        Node<T> found;
//
//        return found;
//    }

    public static <T> void dfs(Node<T> node, T value) {
        if (node.value == value) {
            System.out.println("Found it: " + node.value);
        }
        for (Node<T> child : node.children) {
            dfs(child, value);
        }
    }
}
