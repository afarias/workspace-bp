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
        this.firstNode = null;
        this.lastNode = null;
        this.capacity = capacity;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null);
    }

    /**
     * TODO : a implémenter
     *
     * @return
     */
    @Override
    public boolean isFull() {
        return false;
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
        return 0;
    }

    @Override
    public void addAtBeginning(int number) {

    }

    @Override
    public void addAtEnd(int number) {

        Node node = new Node(number);
        if (this.isEmpty()) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.setNextNode(node);

            lastNode = node;
        }
    }

    @Override
    public void addAt(int number, int index) {

    }

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

    @Override
    public boolean contains(int number) {
        return false;
    }
}
