package graph.problems.java;

import java.util.List;

public class DFS implements Algorithm {
    public static <T> void search(T value, Node<T> node, List<Node<T>> found) {
        if (node == null) return;
        if (node.value == value) {
            System.out.println("Found it: " + node.value);
            found.add(node);
        }
        for (Node<T> child : node.children) {
            search(value, child, found);
        }
    }
}
