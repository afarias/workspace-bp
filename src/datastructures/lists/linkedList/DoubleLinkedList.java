package datastructures.lists.linkedList;

import datastructures.lists.IListInt;

/**
 * TODO : Implémenter la classe
 * TODO : marquer les TODO individuels pour chaque méthode
 * TODO : créer les tests
 * Created by Admin on 19/05/2016.
 */
public class DoubleLinkedList implements IListInt {

    protected DoubleNode firstNode;
    protected DoubleNode lastNode;
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

    public DoubleNode getFirstNode() {
        return firstNode;
    }

    public DoubleNode getLastNode() {
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
        DoubleNode currentNode = this.firstNode;
        int size = 0;
        if (regularDirection == false) {
            while (currentNode != null) {
                size++;
                currentNode = currentNode.getPreviousNode();
            }
        } else {
            while (currentNode != null) {
                size++;
                currentNode = currentNode.getNextNode();
            }
        }
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void addAtBeginning(int number) {
        DoubleNode node = new DoubleNode(number);
        if (this.isEmpty()) {
            this.lastNode = node;
        } else {
            if (regularDirection == false) {
                node.setPreviousNode(this.firstNode);
                this.firstNode.setNextNode(node);
            } else {
                node.setNextNode(this.firstNode);
                this.firstNode.setPreviousNode(node);
            }
        }
        this.firstNode = node;
    }

    @Override
    public void addAtEnd(int number) {
        DoubleNode node = new DoubleNode(number);
        if (this.isEmpty()) {
            this.firstNode = node;
        } else {
            if (regularDirection == false) {
                node.setNextNode(this.lastNode);
                this.lastNode.setPreviousNode(node);
            } else {

                node.setPreviousNode(this.lastNode);
                this.lastNode.setNextNode(node);

            }
        }
        this.lastNode = node;
    }

    @Override
    public void addAt(int number, int index) {
        DoubleNode node = new DoubleNode(number);
        if (this.isFull()) {
            throw new IllegalStateException("Overload capacity");
        } else if (this.size() < index) {
            throw new IllegalStateException("Index out of bound");
        } else if (index == 0) {
            this.addAtBeginning(number);
        } else if (index == this.size()) {
            this.addAtEnd(number);
        } else {
            DoubleNode currentNode = this.firstNode;

            int currentIndex = 0;
            if (regularDirection == false) {
                while (currentIndex < index - 1) {
                    currentNode = currentNode.getPreviousNode();
                    currentIndex++;
                }
                node.setPreviousNode(currentNode.getPreviousNode());
                node.setNextNode(currentNode);
                currentNode.setPreviousNode(node);
            } else {
                while (currentIndex < index - 1) {
                    currentNode = currentNode.getNextNode();
                    currentIndex++;
                }
                node.setNextNode(currentNode.getNextNode());
                node.setPreviousNode(currentNode);
                currentNode.setNextNode(node);
            }


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
            if (regularDirection == false) {
                this.firstNode.setPreviousNode(null);
            } else {

                this.firstNode.setNextNode(null);
            }
        }

        // Définir le deuxième terme comme étant le premier de la liste
        DoubleNode extractedNode = this.firstNode;
        if (regularDirection == false) {
            this.firstNode = this.firstNode.getPreviousNode();
        } else {
            this.firstNode = this.firstNode.getNextNode();
        }
        return extractedNode.getValue();
    }


    @Override
    public int removeLast() {
        // cas vide : renvoyer exception
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove data from empty list");
        }
        // cas avec une seule valeur ?
        if (this.size() == 1) {
            int extractedValue = this.firstNode.getValue();
            if (regularDirection == false) {
                this.firstNode.setPreviousNode(null);
            } else {

                this.firstNode.setNextNode(null);
            }
        }

        // Définir le deuxième terme comme étant le dernier de la liste
        DoubleNode extractedNode = this.lastNode;
        if (regularDirection == false) {
            this.lastNode = this.lastNode.getNextNode();
            this.lastNode.setPreviousNode(null);
        } else {
            this.lastNode = this.lastNode.getPreviousNode();
            this.lastNode.setNextNode(null);
        }
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
        DoubleNode aNode = this.firstNode;
        int extracted = 0;
        if (regularDirection == false){
            for (i = 0; i <= index - 2; i++) {
                aNode = aNode.getPreviousNode();
            }
            extracted = aNode.getPreviousNode().getValue();
            aNode.setPreviousNode(aNode.getPreviousNode().getPreviousNode());
            aNode.getPreviousNode().setNextNode(aNode);
        }else {
            for (i = 0; i <= index - 2; i++) {
                aNode = aNode.getNextNode();
            }
            extracted = aNode.getNextNode().getValue();
            aNode.setNextNode(aNode.getNextNode().getNextNode());
            aNode.getNextNode().setPreviousNode(aNode);
        }
        return extracted;
    }

    @Override
    public int getAt(int index) {

        if (index >= size() || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        DoubleNode currentNode = this.firstNode;
        int currentIndex = 0;
        if (regularDirection == false) {
            while (currentIndex < index) {
                currentNode = currentNode.getPreviousNode();
                currentIndex++;
            }

        } else {

            while (currentIndex < index) {
                currentNode = currentNode.getNextNode();
                currentIndex++;
            }
        }
        return currentNode.getValue();
    }

    @Override
    public boolean contains(int number) {
        int i = 0;
        DoubleNode aNode = this.firstNode;
        for (i = 0; i <= this.size() - 1; i++) {
            if (aNode.getValue() == number) {
                return true;
            }
            aNode = aNode.getNextNode();
        }
        return false;
    }

    @Override
    public void revert() {
        this.regularDirection = !this.regularDirection;
        DoubleNode transferNode = this.firstNode;
        this.firstNode = this.lastNode;
        this.lastNode = transferNode;
    }
}
