package graph.problems.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test void rootNodeTest() {
        Tree<String> tree = new Tree("Command Structure");
        assertEquals(tree.value, "Command Structure");
    }

    @Test void addChildrenTest() {
        Tree<String> tree = new Tree("Command Structure");
        assertEquals(tree.children.get(0).value, "General");
    }
}
