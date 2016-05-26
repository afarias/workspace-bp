package datastructures.lists.linkedList;

/**
 * This object is the minimal entity of our List.
 * Created by Admin on 19/05/2016.
 */
class DoubleNode {
    private DoubleNode nextNode;
    private DoubleNode previousNode;
    private int value;

    DoubleNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.previousNode = null;
    }

    DoubleNode getPreviousNode() {
        return previousNode;
    }

    void setPreviousNode(DoubleNode previousNode) {
        this.previousNode = previousNode;
    }

    int getValue() {
        return value;
    }

    DoubleNode getNextNode() {
        return nextNode;
    }

    void setNextNode(DoubleNode nextNode) {
        this.nextNode = nextNode;
    }

}