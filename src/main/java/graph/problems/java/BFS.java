package graph.problems.java;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BFS {
    public static <T> Node<T> search(T value, Node<T> node) {
        var found = new LinkedList<Node<T>>();
        traverse(value, node, found);
        return found.get(0);
    }

    public static <T> List<List<T>> getLayers(Node<T> node) {
        var layers = new LinkedList<List<T>>();
        var root = new LinkedList<T>();
        root.add(node.value);
        layers.add(root);
        var layer = node.children.stream().map(child -> child.value).collect(Collectors.toList());
        layers.add(layer);
        return layers;
    }

    public static <T> List<T> nodeValue(List<Node<T>> nodes) {
        return nodes.stream().map(node -> node.value).collect(Collectors.toList());
    }

    private static <T> void traverse(T value, Node<T> node, List<Node<T>> found) {
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
