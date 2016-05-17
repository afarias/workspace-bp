package datastructures.lists.linkedList;

/** This class is responsible for providing the implementation of a node of a linked list.
 * Created by Admin on 16/05/2016.
 */
public class Node {
    private int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
