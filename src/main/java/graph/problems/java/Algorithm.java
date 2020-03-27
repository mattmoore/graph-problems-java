package graph.problems.java;

import java.util.List;

public interface Algorithm {
    static <T> void search(T value, Node<T> node, List<Node<T>> found) throws Exception {
        throw new Exception("Algorithm.search must be implemented.");
    }
}
