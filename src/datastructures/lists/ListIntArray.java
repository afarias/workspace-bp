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

        this.shiftRight();

        lastIndex++;
        myList[0] = number;
    }

    /** TODO
     * This method is responsible for shifting the values of the myList Array one step on the right.
     */
    private void shiftRight(int index) {
        if (isFull())
            throw new IllegalStateException("Le tableau est plein");

        else if (isEmpty()) {
            return;
        }
        /**
         * TODO
         */
        if (index>lastIndex){

        }

        for (int i = lastIndex - 1; i == 0; i--) {
            myList[i + 1] = myList[i];
        }
    }



    @Override
    public void addAtEnd(int number) {
        if (isFull()) {
            throw new IllegalStateException("Le tableau est plein");
        }
        myList[this.lastIndex + 1] = number;
        lastIndex++;
    }

    @Override
    public void addAt(int number, int index) {
        if (isFull()) {
            throw new IllegalStateException("Le tableau est plein");
        }


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
    public void removeAt(int number, int index) {

    }
}
