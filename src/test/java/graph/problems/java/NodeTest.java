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

        assertEquals("Command Structure", DFS.search("Command Structure", commandStructure).value, "finds the first node");
        assertEquals("General", DFS.search("General", commandStructure).value, "finds the second level");
        assertEquals("Sergeant", DFS.search("Sergeant", commandStructure).value, "finds the third level, first neighbor");
        assertEquals("Corporal", DFS.search("Corporal", commandStructure).value, "finds the third level, second neighbor");
    }
}
