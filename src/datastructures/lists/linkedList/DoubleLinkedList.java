package datastructures.lists.linkedList;

/**
 * Created by Admin on 19/05/2016.
 */
public class DoubleLinkedList extends LinkedList {

    /**
     * This constructor is responsible for creating a new list with capacity
     *
     * @param capacity The maximum range of the List
     */
    public DoubleLinkedList(int capacity) {
        super(capacity);
    }

    @Override
    public void addAtBeginning(int number) {
        DoubleNode node = new DoubleNode(number);
        if (this.isEmpty()) {
            lastNode = node;
        } else {
            node.setNextNode(firstNode);

        }
        node.setNextNode(firstNode.getNextNode());
        this.firstNode = node;
    }
/**
    @Override
    public void addAtEnd(int number) {
        DoubleNode node = new DoubleNode(number);
        node.setNextNode(null);
        this.lastNode = node;
        DoubleNode currentNode = this.firstNode;

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
**/
}
