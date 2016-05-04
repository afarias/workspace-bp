package datastructures.lists;

/**
 * Created by andres on 5/2/16.
 */
public interface IListInt {

    /**
     * This method is responsible for determining whether the list is empty or not.
     *
     * @return Returns <code>true</code> if the list is empty and <code>false</code> otherwise.
     */
    public boolean isEmpty();

    /**
     * This method is responsible for determining whether the list is full or not.
     *
     * @return Returns <code>true</code> if the list is full and <code>false</code> otherwise.
     */
    public boolean isFull();

    /**
     * This method is responsible for determining the current number of elements within the list.
     *
     * @return The number of numbers stored in the list.
     */
    public int size();

    /**
     * This method is responsible for determining the current capacity of the list.
     * @return The current list capacity
     */
    public int capacity();

    /**
     * This method is responsible for storing the <code>number</code> at the beginning of the list.
     *
     * @param number The number to be inserted.
     */
    public void addAtBeginning(int number);

    /**
     * This method is responsible for storing the <code>number</code> at the end of the list.
     *
     * @param number The number to be inserted at the end of the list.
     */
    public void addAtEnd(int number);

    /**
     * This method is responsible for storing the <code>number</code> at a given (<code>index</code>) position of the
     * list.
     *
     * @param number The number to be inserted at the end of the list.
     * @param index  The position at which
     */
    public void addAt(int number, int index);

    /**
     * This method is responsible for extracting the first number of the list.
     *
     * @return The number extracted.
     */
    public int removeFirst();

    /**
     * This method is responsible for extracting the last number of the list.
     *
     * @return The number extracted.
     */
    public int removeLast();

    /**
     * This method is responsible for extracting the <code>number</code> at a given (<code>index</code>) position of the
     * list.
     *
     * @param index  The position at which
     */
    public int removeAt(int index);
}
