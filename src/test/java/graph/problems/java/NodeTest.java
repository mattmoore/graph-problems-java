package graph.problems.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test void rootNodeTest() {
        Node<String> node = new Node("Command Structure");
        assertEquals("Command Structure", node.value);
    }

    @Test void addChildrenTest() {
        Node<String> node = new Node("Command Structure");
        node.addChild("General");
        assertEquals("General", node.children.get(0).value);
    }

    @Test void dfsTest() {
        Node<String> commandStructure = new Node("Command Structure");
        Node general = commandStructure.addChild("General");
        Node sergeant = general.addChild("Sergeant");
        Node corporal = general.addChild("Corporal");

//        assertEquals("Command Structure", tree.dfs("Command Structure").value, "finds the first node");
//        assertEquals("General", tree.dfs("General").value, "finds the second level");
//        assertEquals("Sergeant", tree.dfs("Sergeant").value, "finds the third level, first neighbor");
        Node.dfs(commandStructure, "Corporal");
    }
}
