package datastructures.lists;

/**
 * This interfaces states and defines how a List is expected to work and behave.
 *
 * A list will have elements, which are in a given order. The first element is at the position 0.
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
     *
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
     * @param index  The position at which the number is inserted. Indexes start at 0.
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
     * This method is responsible for extracting the <code>number</code> at a given (<code>index</code>) position of
     * the
     * list.
     *
     * @param index The position at which
     */
    public int removeAt(int index);

    /**
     * This method is responsible for retrieving the number stored at the given <code>index</code>.
     *
     * @param index The index an which the element is. Indexes start at 0.
     *
     * @return The element on the list at the <code>index</code> position.
     */
    public int getAt(int index);

    /**
     * This method is responsible for looking for a given <code>number</code> inside the list.
     *
     * @param number The number which is looked for.
     *
     * @return <code>true</code> if the <code>number</code> is in the list and <code>false</code> otherwise.
     */
    public boolean contains(int number);
}
