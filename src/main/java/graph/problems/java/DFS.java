package graph.problems.java;

import java.util.LinkedList;
import java.util.List;

public class DFS {
    public static <T> Node<T> search(T value, Node<T> node) {
        var found = new LinkedList<Node<T>>();
        traverse(value, node, found);
        return found.get(0);
    }

    private static <T> void traverse(T value, Node<T> node, List<Node<T>> found) {
        if (node == null) return;
        if (node.value == value) {
            System.out.println("Found it: " + node.value);
            found.add(node);
            return;
        }
        for (Node<T> child : node.children) {
            traverse(value, child, found);
        }
    }
}
