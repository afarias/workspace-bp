package datastructures.lists.linkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
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
        assertEquals(0, linkedList.size());
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

    @Test
    public void testRemoveFirst() throws Exception {
        LinkedList list = new LinkedList(10);
        list.addAt(1, 0);
        list.addAt(2, 0);
        list.addAt(3, 1);

        int removed = list.removeFirst();
        assertEquals(removed, 2);
    }

    @Test
    public void testRemoveLast() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeLast();
        assertEquals(2, removed);
        assertEquals(1, array.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAt01() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);
        array.addAtEnd(3);
        array.addAtEnd(4);

        assertEquals(array.getAt(0), 1);
        assertEquals(array.getAt(1), 2);
        assertEquals(array.getAt(2), 3);
        assertEquals(array.getAt(3), 4);
        assertEquals(array.size(), 4);
        array.removeAt(4);
    }

    @Test
    public void testRemoveAt02() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeAt(0);
        assertEquals(1, removed);
        assertEquals(1, array.size());
        assertEquals(array.getFirstNode(), array.getLastNode());

    }

    @Test
    public void testRemoveAt03() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);
        array.addAtEnd(3);

        int removed = array.removeAt(1);
        assertEquals(2, removed);
        assertEquals(2, array.size());
        assertEquals(array.getFirstNode().getNextNode(), array.getLastNode());

    }

    @Test
    public void testRemoveAt04() throws Exception {
        LinkedList array = new LinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);
        array.addAtEnd(3);
        array.addAtEnd(4);

        int removed = array.removeAt(2);
        assertEquals(3, removed);
        assertEquals(3, array.size());
        assertEquals(array.getFirstNode().getNextNode().getNextNode(), array.getLastNode());

    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveFirst02() throws Exception {
        LinkedList linkedList = new LinkedList(20);
        linkedList.removeFirst();

    }

    @Test
    public void testRemoveFirst03() throws Exception {
        LinkedList linkedList = new LinkedList(20);
        linkedList.addAtBeginning(1);
        linkedList.removeFirst();

        assertTrue(linkedList.isEmpty());

    }

    @Test
    public void testContains01() throws Exception {
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
    @Test
    public void testrevert01() throws Exception {
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
        array.revert();

        assertEquals(10, array.getAt(0));
        assertEquals(9, array.getAt(1));
        assertEquals(8, array.getAt(2));
        assertEquals(7, array.getAt(3));
        assertEquals(6, array.getAt(4));
        assertEquals(5, array.getAt(5));
        assertEquals(4, array.getAt(6));
        assertEquals(3, array.getAt(7));
        assertEquals(2, array.getAt(8));
        assertEquals(1, array.getAt(9));
    }
}

