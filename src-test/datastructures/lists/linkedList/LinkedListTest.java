package datastructures.lists.linkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**TODO : faire tourner tous les tests
 * Created by Admin on 16/05/2016.
 */
public class LinkedListTest {

    @Test
    public void testGetAt() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(2);

        assertEquals(2, array.getAt(0));

    }

    @Test
    public void testIsEmpty() throws Exception {
        LinkedList emptyArray = new LinkedList(10);
        Assert.assertEquals(true, emptyArray.isEmpty());
    }

    @Test
    public void testIsEmpty02() throws Exception {
        LinkedList emptyArray = new LinkedList(10);
        emptyArray.addAtEnd(10);

        Assert.assertEquals(false, emptyArray.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() throws Exception {
        new LinkedList(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor02() throws Exception {
        new LinkedList(0);
    }

    @Test
    public void testIsFull() throws Exception {
        LinkedList emptyArray = new LinkedList(1);
        emptyArray.addAtEnd(1);

        assertTrue(emptyArray.isFull());
    }

    @Test
    public void testIsFull02() throws Exception {
        LinkedList emptyArray = new LinkedList(2);
        emptyArray.addAtEnd(1);
        emptyArray.addAtEnd(2);

        assertTrue(emptyArray.isFull());
    }

    @Test
    public void testSize01() throws Exception {
        LinkedList array = new LinkedList(2);
        array.addAtEnd(1);

        assertEquals(1, array.size());
    }

    @Test
    public void testSize02() throws Exception {
        LinkedList linkedList = new LinkedList(10);
        assertEquals(0,linkedList.size());
    }

    @Test
    public void testCapacity() throws Exception {
        LinkedList array = new LinkedList(2);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity03() throws Exception {
        LinkedList array = new LinkedList(2);
        array.addAtEnd(1);
        array.addAtEnd(1);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity01() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);

        assertEquals(10, array.capacity());
    }

    @Test
    public void testAddAtBeginning() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);

        assertEquals(array.getAt(0), 1);
    }

    @Test
    public void testAddAtBeginning02() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtBeginning(1);
        array.addAtBeginning(2);

        assertEquals(array.getAt(1), 1);
        assertEquals(array.getAt(0), 2);
    }

    @Test
    public void testAddAtEnd01() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        assertEquals(array.getAt(1), 2);
        assertEquals(array.getAt(0), 1);

    }

    @Test
    public void testAddAt00() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAt(1, 0);

        assertEquals(array.getAt(0), 1);
    }

    @Test
    public void testAddAt01() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAt(1, 0);
        array.addAt(2, 1);

        assertEquals(array.getAt(0), 1);
        assertEquals(array.getAt(1), 2);
    }

    @Test
    public void testAddAt02() throws Exception {

        LinkedList array = new LinkedList(10);
        array.addAt(1, 0);
        array.addAt(2, 0);
        array.addAt(3, 1);

        assertEquals(array.getAt(0), 2);
        assertEquals(array.getAt(1), 3);
        assertEquals(array.getAt(2), 1);
            }
    //TODO : Tester les Remove
    @Test
    public void testRemoveFirst() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAt(1, 0);
        array.addAt(2, 0);
        array.addAt(3, 1);

        int removed = array.removeFirst();
        assertEquals(removed, 2);
    }

    @Test
    public void testRemoveLast() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeLast();
        assertEquals(removed, 2);
    }

    @Test
    public void testRemoveAt() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeAt(0);
        assertEquals(removed, 1);

    }
    //TODO : tester contains
    @Test
    public void contains1() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);
        array.addAtEnd(3);
        array.addAtEnd(4);
        array.addAtEnd(5);
        array.addAtEnd(6);
        array.addAtEnd(7);
        array.addAtEnd(8);
        array.addAtEnd(9);
        array.addAtEnd(10);

        boolean contains = array.contains(1);
        boolean contains2 = array.contains(10);
        boolean contains3 = array.contains(0);
        assertTrue(contains);
        assertTrue(contains2);
        assertFalse(contains3);

    }
}