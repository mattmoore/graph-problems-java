package graph.problems.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test void rootNodeTest() {
        Tree<String> tree = new Tree("Command Structure");
        assertEquals("Command Structure", tree.value);
    }

    @Test void addChildrenTest() {
        Tree<String> tree = new Tree("Command Structure");
        tree.addChild("General");
        assertEquals("General", tree.children.get(0).value);
    }

    @Test void dfsTest() {
        Tree<String> tree = new Tree("Command Structure");
        Tree general = tree.addChild("General");
        Tree sergeant = general.addChild("Sergeant");
        Tree corporal = general.addChild("Corporal");

        assertEquals("Command Structure", tree.dfs("Command Structure").value, "finds the first node");
        assertEquals("General", tree.dfs("General").value, "finds the second level");
        assertEquals("Sergeant", tree.dfs("Sergeant").value, "finds the third level");
    }
}
