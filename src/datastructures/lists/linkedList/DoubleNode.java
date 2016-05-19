package datastructures.lists.linkedList;

/**
 * Created by Admin on 19/05/2016.
 */
public class DoubleNode extends Node {
    private Node previousNode;

    public DoubleNode(int value) {
        super(value);
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

}