package datastructures.lists.linkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * A class for testing the Double Linked List. The big hypothesis on these tests is that the method addAtEnd is working
 * fine.
 */
public class DoubleLinkedListTest {
    @Test (expected = IllegalArgumentException.class)
    public void testGetAt01() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.getAt(100);
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveAt05() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        assertEquals(1, doubleLinkedList.removeAt(0));
    }

    @Test
    public void testRemoveAt06() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAtBeginning(1);
        doubleLinkedList.addAtBeginning(1);
        assertEquals(1, doubleLinkedList.removeAt(1));
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveLast01() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.removeLast();
    }

    @Test
    public void testRemoveLast02() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAtBeginning(1);
        doubleLinkedList.removeLast();

        assertTrue(doubleLinkedList.isEmpty());
    }

    @Test
    public void testRemoveLast03() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAtBeginning(1);
        doubleLinkedList.revert();
        doubleLinkedList.removeLast();

        assertTrue(doubleLinkedList.isEmpty());
    }

    @Test
    public void testRemoveLast04() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAtBeginning(1);
        doubleLinkedList.addAtBeginning(2);
        doubleLinkedList.revert();

        assertEquals(2, doubleLinkedList.removeLast());
    }

    @Test(expected = IllegalStateException.class)
    public void testaddAt01() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(2);
        doubleLinkedList.addAt(0, 0);
        doubleLinkedList.addAt(0, 0);
        doubleLinkedList.addAt(0, 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testaddAt02() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAt(1, 0);
        doubleLinkedList.addAt(0, 2);

    }

    @Test
    public void testaddAt03() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.revert();
        doubleLinkedList.addAt(1, 0);
        doubleLinkedList.addAt(2, 1);
        doubleLinkedList.addAt(3, 1);
        doubleLinkedList.addAt(4, 1);
        doubleLinkedList.addAt(5, 1);
        doubleLinkedList.addAt(6, 1);
        doubleLinkedList.addAt(7, 1);
        doubleLinkedList.addAt(8, 5);
        assertEquals(2, doubleLinkedList.getAt(7));

    }

    @Test
    public void testaddAt04() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.addAt(1, 0);
        doubleLinkedList.addAt(2, 1);
        doubleLinkedList.addAt(3, 1);
        doubleLinkedList.addAt(4, 1);
        doubleLinkedList.addAt(5, 1);
        doubleLinkedList.addAt(6, 1);
        doubleLinkedList.addAt(7, 1);
        doubleLinkedList.addAt(8, 5);
        assertEquals(2, doubleLinkedList.getAt(7));

    }

    @Test
    public void testaddAtBeginning01() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.revert();
        doubleLinkedList.addAtBeginning(1);
        doubleLinkedList.addAtBeginning(2);

        assertEquals(1, doubleLinkedList.getAt(1));
        assertEquals(2, doubleLinkedList.getAt(0));

    }

    @Test
    public void testAddAtEnd02() throws Exception {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(10);
        doubleLinkedList.revert();
        doubleLinkedList.addAtEnd(1);
        doubleLinkedList.addAtEnd(2);

        assertEquals(2, doubleLinkedList.getAt(1));
        assertEquals(1, doubleLinkedList.getAt(0));

    }

    @Test
    public void testcapacity() throws Exception {
        Random random = new Random();
        int intsToInsert = random.nextInt(1000);
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(intsToInsert);
        assertEquals(intsToInsert, DoubleLinkedList.getCapacity());


    }

    @Test
    public void testSize01() throws Exception {
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(10);
        assertEquals(0, DoubleLinkedList.size());
    }

    @Test
    public void testSize02() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(2);
        array.addAtEnd(1);

        assertEquals(1, array.size());
    }

    @Test
    public void testSize03() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(2);
        array.addAt(0, 0);

        assertEquals(1, array.size());
    }

    @Test
    public void testSize0N() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(2);

        /* A random number of ints are added to the list */
        Random random = new Random();
        int intsToInsert = random.nextInt(1000);
        for (int i = 0; i < intsToInsert; i++) {
            array.addAtEnd(random.nextInt(2000));
        }

        assertEquals(intsToInsert, array.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        DoubleLinkedList emptyArray = new DoubleLinkedList(10);
        Assert.assertEquals(true, emptyArray.isEmpty());
    }

    @Test
    public void testIsEmpty02() throws Exception {
        DoubleLinkedList emptyArray = new DoubleLinkedList(10);
        emptyArray.addAtEnd(10);

        Assert.assertEquals(false, emptyArray.isEmpty());
    }

    @Test
    public void testAddAtEnd01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        assertEquals(array.getAt(1), 2);
        assertEquals(array.getAt(0), 1);
    }

    @Test
    public void testGetAt() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(2);

        assertEquals(2, array.getAt(0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() throws Exception {
        new DoubleLinkedList(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor02() throws Exception {
        new DoubleLinkedList(0);
    }

    @Test
    public void testIsFull() throws Exception {
        DoubleLinkedList emptyArray = new DoubleLinkedList(1);
        emptyArray.addAtEnd(1);

        assertTrue(emptyArray.isFull());
    }

    @Test
    public void testIsFull02() throws Exception {
        DoubleLinkedList emptyArray = new DoubleLinkedList(2);
        emptyArray.addAtEnd(1);
        emptyArray.addAtEnd(2);

        assertTrue(emptyArray.isFull());
    }


    @Test
    public void testCapacity() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(2);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity03() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(2);
        array.addAtEnd(1);
        array.addAtEnd(1);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(1);

        assertEquals(10, array.capacity());
    }

    @Test
    public void testAddAtBeginning() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(1);

        assertEquals(array.getAt(0), 1);
    }

    @Test
    public void testAddAtBeginning02() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtBeginning(1);
        array.addAtBeginning(2);

        assertEquals(array.getAt(1), 1);
        assertEquals(array.getAt(0), 2);
    }


    @Test
    public void testAddAt00() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAt(1, 0);

        assertEquals(array.getAt(0), 1);
    }

    @Test
    public void testAddAt01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAt(1, 0);
        array.addAt(2, 1);

        assertEquals(array.getAt(0), 1);
        assertEquals(array.getAt(1), 2);
    }

    @Test
    public void testAddAt02() throws Exception {

        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAt(1, 0);
        array.addAt(2, 0);
        array.addAt(3, 1);

        assertEquals(array.getAt(0), 2);
        assertEquals(array.getAt(1), 3);
        assertEquals(array.getAt(2), 1);
    }

    @Test
    public void testRemoveFirst() throws Exception {
        DoubleLinkedList list = new DoubleLinkedList(10);
        list.addAt(1, 0);
        list.addAt(2, 0);
        list.addAt(3, 1);

        int removed = list.removeFirst();
        assertEquals(removed, 2);
    }

    @Test
    public void testRemoveFirst04() throws Exception {
        DoubleLinkedList list = new DoubleLinkedList(10);
        list.revert();
        list.addAt(1, 0);
        list.addAt(2, 0);
        list.addAt(3, 1);

        int removed = list.removeFirst();
        assertEquals(removed, 2);
    }

    @Test
    public void testRemoveLast() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeLast();
        assertEquals(2, removed);
        assertEquals(1, array.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAt01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
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
        DoubleLinkedList array = new DoubleLinkedList(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        int removed = array.removeAt(0);
        assertEquals(1, removed);
        assertEquals(1, array.size());
        assertEquals(array.getFirstNode(), array.getLastNode());

    }

    @Test
    public void testRemoveAt03() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
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
        DoubleLinkedList array = new DoubleLinkedList(10);
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
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(20);
        DoubleLinkedList.removeFirst();

    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveFirst05() throws Exception {
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(20);
        DoubleLinkedList.revert();
        DoubleLinkedList.removeFirst();

    }

    @Test
    public void testRemoveFirst03() throws Exception {
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(20);
        DoubleLinkedList.addAtBeginning(1);
        DoubleLinkedList.removeFirst();

        assertTrue(DoubleLinkedList.isEmpty());

    }

    @Test
    public void testRemoveFirst06() throws Exception {
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(20);
        DoubleLinkedList.revert();
        DoubleLinkedList.addAtBeginning(1);
        DoubleLinkedList.removeFirst();

        assertTrue(DoubleLinkedList.isEmpty());

    }

    @Test
    public void testContains01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(10);
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
        DoubleLinkedList array = new DoubleLinkedList(10);
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

    @Test
    public void testComplete01() throws Exception {
        DoubleLinkedList array = new DoubleLinkedList(5);
        array.addAtEnd(1);
        array.addAtEnd(2);
        array.addAtEnd(3);
        array.addAtEnd(4);
        array.addAtEnd(5);
        array.revert();
        int a = array.removeAt(2);
        array.revert();
        int b = array.removeLast();
        array.revert();

        assertEquals(4, array.getFirstNode().getValue());
        assertEquals(2, array.getAt(1));
        assertEquals(1, array.getLastNode().getValue());
        assertEquals(3, a);
        assertEquals(5, b);
        assertEquals(3, array.size());

    }
}