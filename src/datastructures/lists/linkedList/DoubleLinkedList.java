package datastructures.lists.linkedList;

import datastructures.lists.IListInt;

/** TODO : Implémenter la classe
 * TODO : marquer les TODO individuels pour chaque méthode
 * TODO : créer les tests
 * Created by Admin on 19/05/2016.
 */
public class DoubleLinkedList implements IListInt {

    protected Node firstNode;
    protected Node lastNode;
    protected int capacity;
    protected boolean regularDirection;

    /**
     * This constructor is responsible for creating a new list with capacity
     *
     * @param capacity The maximum range of the List
     */
    public DoubleLinkedList(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("The capacity can't be less than 1");
        }
        this.firstNode = null;
        this.lastNode = null;
        this.capacity = capacity;
        this.regularDirection = true;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getCapacity() {
        return capacity;
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

    //TODO : implémenter les addAt - rajouter les previousNode
    @Override
    public void addAtBeginning(int number) {
        Node node = new Node(number);
        if (this.isEmpty()) {
            this.lastNode = node;
        } else {
            node.setNextNode(this.firstNode);
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

    // TODO : implémenter les removeAt - retirer les previousNode
    @Override
    public int removeFirst() {
        // cas vide : renvoyer exception
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove data from empty list");
        }
        // cas avec une seule valeur ?
        if (this.size() == 1) {
            int extractedValue = this.firstNode.getValue();
            this.firstNode.setNextNode(null);
        }

        // Définir le deuxième terme comme étant le premier de la liste
        Node extractedNode = this.firstNode;
        this.firstNode = this.firstNode.getNextNode();
        return extractedNode.getValue();
    }


    @Override
    public int removeLast() {
        // cas vide ou une seule valeur
        if (this.size() < 1) {
            return this.removeFirst();
        }

        // cas général
        Node extractedNode = this.lastNode;

        int i = 0;
        Node aNode = this.firstNode;
        for (i = 0; i < this.size() - 2; i++) {
            aNode = aNode.getNextNode();
        }

        aNode.setNextNode(null);
        this.lastNode = aNode;

        return extractedNode.getValue();
    }


    @Override
    public int removeAt(int index) {
        // cas vide ou une seule valeur
        if (this.size() < 1) {
            return this.removeFirst();
        }

        // pas de node à l'index
        if (index > this.size() - 1) {
            throw new IllegalArgumentException("the list don't have any value at this index");
        }

        // cas où on retire le dernier
        if (index == this.size() - 1) {
            return this.removeLast();
        }

        // cas où on retire le premier
        if (index == 0) {
            return this.removeFirst();
        }

        // cas général
        int i = 0;
        Node aNode = this.firstNode;
        for (i = 0; i <= index - 2; i++) {
            aNode = aNode.getNextNode();
        }
        int extracted = aNode.getNextNode().getValue();
        aNode.setNextNode(aNode.getNextNode().getNextNode());
        return extracted;
    }
    // TODO : optionnel implémenter le getAt pour que ca marche dans les deux sens.
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
        int i = 0;
        Node aNode = this.firstNode;
        for (i = 0; i <= this.size() - 1; i++) {
            if (aNode.getValue() == number) {
                return true;
            }
            aNode = aNode.getNextNode();
        }
        return false;
    }
    // TODO : implémenter pour que ca coute seulement 1 et pas n
    @Override
    public void revert() {
        // We will use a temporary List "transferList" to store the values on opposite order.
        LinkedList transferList = new LinkedList(this.capacity);
        Node currentNode = this.firstNode;
        for (int i = 0; i < size(); i++) {
            transferList.addAtBeginning(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
        // We assign on our current List the value of the transferList.
        this.firstNode = transferList.firstNode;
        this.lastNode = transferList.lastNode;
    }
}
