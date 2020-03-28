package graph.problems.java;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BFS {
    public static <T> Node<T> search(T value, Node<T> node) {
        var found = new LinkedList<Node<T>>();
        findNode(value, node, found);
        return found.get(0);
    }

    public static <T> List<List<T>> layers(Node<T> root) {
        var layerList = new LinkedList<List<T>>();
        var rootEntry = new LinkedList<T>();
        rootEntry.add(root.value);
        layerList.add(rootEntry);
        var layer = root.children.stream().map(child -> child.value).collect(Collectors.toList());
        layerList.add(layer);
        return layerList;
    }

    public static <T> List<T> nodeValues(List<Node<T>> nodes) {
        return nodes.stream().map(node -> node.value).collect(Collectors.toList());
    }

    private static <T> void findNode(T value, Node<T> node, List<Node<T>> found) {
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
            findNode(value, child, found);
        }
    }
}
