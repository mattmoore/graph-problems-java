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
        var lieutenant = corporal.addChild("Lieutenant");

        assertEquals("Command Structure", DFS.search("Command Structure", commandStructure).value, "first level");
        assertEquals("General", DFS.search("General", commandStructure).value, "second level");
        assertEquals("Sergeant", DFS.search("Sergeant", commandStructure).value, "third level, first neighbor");
        assertEquals("Corporal", DFS.search("Corporal", commandStructure).value, "third level, second neighbor");
        assertEquals("Lieutenant", DFS.search("Lieutenant", commandStructure).value, "fourth level");
    }

    @Test void bfsTest() {
        var commandStructure = new Node("Command Structure");
        var general = commandStructure.addChild("General");
        var sergeant = general.addChild("Sergeant");
        var corporal = general.addChild("Corporal");
        var lieutenant = corporal.addChild("Lieutenant");

        assertEquals("Command Structure", BFS.search("Command Structure", commandStructure).value, "first level");
        assertEquals("General", BFS.search("General", commandStructure).value, "second level");
        assertEquals("Sergeant", BFS.search("Sergeant", commandStructure).value, "third level");
        assertEquals("Corporal", BFS.search("Corporal", commandStructure).value, "third level");
        assertEquals("Lieutenant", BFS.search("Lieutenant", commandStructure).value, "fourth level");
    }
}
