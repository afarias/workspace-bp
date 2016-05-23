package datastructures.lists.linkedList;

/**
 * TODO : implémenter
 * Created by Admin on 19/05/2016.
 */
public class DoubleNode {
    protected DoubleNode nextNode;
    protected DoubleNode previousNode;
    private int value;

    public DoubleNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.previousNode = null;
    }

    public DoubleNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleNode previousNode) {
        this.previousNode = previousNode;
    }

    public int getValue() {
        return value;
    }

    public DoubleNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode nextNode) {
        this.nextNode = nextNode;
    }

}