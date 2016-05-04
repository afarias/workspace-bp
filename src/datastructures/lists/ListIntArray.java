package datastructures.lists;

/**
 * Created by andres on 5/2/16.
 */
public class ListIntArray implements IListInt {
    /**
     * This is array will store the numbers.
     */
    private int[] myList;
    /**
     * This Integer is the reference of the last element saved in the list.
     */
    private int lastIndex;

    public ListIntArray(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Le tableau doit avoir une capacité positive");
        }
        myList = new int[capacity];
        lastIndex = 0;
    }

    @Override
    public boolean isEmpty() {
        return (lastIndex < 1);
    }

    @Override
    public boolean isFull() {
        return (lastIndex == this.myList.length);
    }

    @Override
    public int size() {
        return lastIndex;
    }

    @Override
    public int capacity() {
        return this.myList.length;
    }

    @Override
    public void addAtBeginning(int number) {

        if (isFull()) {
            throw new IllegalStateException("Le tableau est plein");
        }

        this.shiftRight(0);

        lastIndex++;
        myList[0] = number;
    }

    /**
     * This method is responsible for shifting the values of the myList Array one step on the right.
     */
    private void shiftRight(int index) {
        if (isFull())
            throw new IllegalStateException("Le tableau est plein");

        else if (isEmpty()) {
            return;
        } else if (index > lastIndex) {
            return;
        } else {
            for (int i = lastIndex; i == index + 1; i--) {
                myList[i] = myList[i - 1];
            }
        }
    }

    /**
     * This method is responsible for shifting the values of the myList Array one step on the left.
     */
    private void shiftLeft(int index) {
        if (isEmpty()) {
            return;
        } else if (index > lastIndex) {
            return;
        } else {
            for (int i = index; i == lastIndex - 1; i++) {
                myList[i] = myList[i + 1];
            }
        }
    }


    @Override
    public void addAtEnd(int number) {
        if (isFull()) {
            throw new IllegalStateException("Le tableau est plein");
        }

        myList[this.lastIndex] = number;
        lastIndex++;
    }

    @Override
    public void addAt(int number, int index) {
        if (isFull()) {
            throw new IllegalStateException("Le tableau est plein");
        }
        this.shiftRight(index);
        myList[index] = number;


    }

    @Override
    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("There is no number to extract");
        }
        int extractedValue = myList[0];
        this.shiftLeft(0);
        myList[lastIndex] = 0;
        lastIndex--;
        return extractedValue;
    }

    @Override
    public int removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("There is no number to extract");
        }
        int extractedValue = myList[lastIndex];
        myList[lastIndex] = 0;
        lastIndex--;
        return extractedValue;

    }

    @Override
    public int removeAt(int index) {
        if (isEmpty()) {
            throw new IllegalStateException("There is no number to extract");
        }
        if (index > lastIndex) {
            throw new IllegalStateException("there is no number in this index");
        }
        int extractedValue = myList[index];
        this.shiftLeft(index);
        myList[lastIndex] = 0;
        lastIndex--;
        return extractedValue;
    }

    // TODO: Implement this.
    @Override
    public int getAt(int index) {
        return myList[index];
    }
}
