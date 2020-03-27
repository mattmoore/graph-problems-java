package graph.problems.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test void rootNodeTest() {
        var node = new Node<String>("Command Structure");
        assertEquals("Command Structure", node.value);
    }

    @Test void addChildrenTest() {
        var node = new Node<String>("Command Structure");
        node.addChild("General");
        assertEquals("General", node.children.get(0).value);
    }

    @Test void dfsTest() {
        var commandStructure = new Node("Command Structure");
        var general = commandStructure.addChild("General");
        var sergeant = general.addChild("Sergeant");
        var corporal = general.addChild("Corporal");

        assertEquals("Command Structure", Node.search("Command Structure", commandStructure, AlgorithmType.DFS).value, "finds the first node");
        assertEquals("General", Node.search("General", commandStructure, AlgorithmType.DFS).value, "finds the second level");
        assertEquals("Sergeant", Node.search("Sergeant", commandStructure, AlgorithmType.DFS).value, "finds the third level, first neighbor");
        assertEquals("Corporal", Node.search("Corporal", commandStructure, AlgorithmType.DFS).value, "finds the third level, second neighbor");
    }
}
