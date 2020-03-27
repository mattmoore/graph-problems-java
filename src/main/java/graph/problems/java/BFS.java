package graph.problems.java;

import java.util.LinkedList;
import java.util.List;

public class BFS {
    public static <T> Node<T> search(T value, Node<T> node) {
        var found = new LinkedList<Node<T>>();
        traverse(value, node, found);
        return found.get(0);
    }

    public static <T> void traverse(T value, Node<T> node, List<Node<T>> found) {
        if (node == null) return;
        if (node.value == value) {
            System.out.println("Found it: " + node.value);
            found.add(node);
            return;
        }
        for (Node<T> child : node.children) {
            if (child.value == value) {
                System.out.println("Found it: " + child.value);
                found.add(child);
                return;
            }
            traverse(value, child, found);
        }
    }
}
