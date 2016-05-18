package datastructures.lists.linkedList;

import datastructures.lists.IListInt;

/**
 * TODO : implements all methods
 * This class is responsible for implementing a list of integers using an linked list strategy.
 * Created by Admin on 16/05/2016.
 */
public class LinkedList implements IListInt {

    private Node firstNode;
    private Node lastNode;
    private int capacity;

    /**
     * This constructor is responsible for creating a new list with capacity
     *
     * @param capacity The maximum range of the List
     */
    public LinkedList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("The capacity can't be less than 1");
        }
        this.firstNode = null;
        this.lastNode = null;
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null);
    }

    @Override
    public boolean isFull() {
        return (this.size() == this.capacity);
    }

    @Override
    public int size() {
        /* With current we traverse the list */
        Node currentNode = this.firstNode;
        int size = 0;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.getNextNode();
        }
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void addAtBeginning(int number) {
        Node node = new Node(number);
        if (this.isEmpty()) {
            lastNode = node;
        } else {
            node.setNextNode(firstNode);
        }
        this.firstNode = node;
    }

    @Override
    public void addAtEnd(int number) {
        Node node = new Node(number);
        node.setNextNode(null);
        this.lastNode = node;
        Node currentNode = this.firstNode;

        int currentIndex = 0;
        if (isEmpty()) {
            this.firstNode = node;
        } else {
            while (currentIndex < size() - 1) {
                currentNode = currentNode.getNextNode();
                currentIndex++;
            }
            currentNode.setNextNode(node);
        }
    }

    @Override
    public void addAt(int number, int index) {
        Node node = new Node(number);
        if (this.isFull()) {
            throw new IllegalStateException("Overload capacity");
        } else if (this.size() < index) {
            throw new IllegalStateException("Index out of bound");
        } else if (index == 0) {
            this.addAtBeginning(number);
        } else if (index == this.size()) {
            this.addAtEnd(number);
        } else {
            Node currentNode = this.firstNode;

            int currentIndex = 0;
            while (currentIndex < index - 1) {
                currentNode = currentNode.getNextNode();
                currentIndex++;
            }
            node.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(node);
        }

    }

    //TODO : Implémenter les remove
    @Override
    public int removeFirst() {
        return 0;
    }


    @Override
    public int removeLast() {
        return 0;
    }


    @Override
    public int removeAt(int index) {
        return 0;
    }

    @Override
    public int getAt(int index) {

        if (index >= size() || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        Node currentNode = this.firstNode;
        int currentIndex = 0;
        while (currentIndex < index) {
            currentNode = currentNode.getNextNode();
            currentIndex++;
        }

        return currentNode.getValue();
    }

    //TODO : implémenter contains
    @Override
    public boolean contains(int number) {
        return false;
    }
}
