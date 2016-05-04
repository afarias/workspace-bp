package datastructures.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListIntArrayTest {

    @Test
    public void testIsEmpty() throws Exception {
        ListIntArray emptyArray = new ListIntArray(10);
        Assert.assertEquals(true, emptyArray.isEmpty());
    }

    @Test
    public void testIsEmpty02() throws Exception {
        ListIntArray emptyArray = new ListIntArray(10);
        emptyArray.addAtEnd(10);

        Assert.assertEquals(false, emptyArray.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor() throws Exception {
        new ListIntArray(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor02() throws Exception {
        new ListIntArray(0);
    }

    @Test
    public void testIsFull() throws Exception {
        ListIntArray emptyArray = new ListIntArray(1);
        emptyArray.addAtEnd(1);

        assertTrue(emptyArray.isFull());
    }

    @Test
    public void testIsFull02() throws Exception {
        ListIntArray emptyArray = new ListIntArray(2);
        emptyArray.addAtEnd(1);
        emptyArray.addAtEnd(2);

        assertTrue(emptyArray.isFull());
    }

    @Test
    public void testSize01() throws Exception {
        ListIntArray array = new ListIntArray(2);
        array.addAtEnd(1);

        assertEquals(1, array.size());
    }

    @Test
    public void testCapacity() throws Exception {
        ListIntArray array = new ListIntArray(2);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity03() throws Exception {
        ListIntArray array = new ListIntArray(2);
        array.addAtEnd(1);
        array.addAtEnd(1);

        assertEquals(2, array.capacity());
    }

    @Test
    public void testCapacity01() throws Exception {
        ListIntArray array = new ListIntArray(10);
        array.addAtEnd(1);

        assertEquals(10, array.capacity());
    }

    @Test
    public void testAddAtBeginning() throws Exception {
        ListIntArray array = new ListIntArray(10);
        array.addAtEnd(1);

        assertEquals(array.getAt(1), 1);
    }
    @Test
    public void testAddAtBeginning02() throws Exception {
        ListIntArray array = new ListIntArray(10);
        array.addAtEnd(1);
        array.addAtEnd(2);

        assertEquals(array.getAt(2), 1);
        assertEquals(array.getAt(1), 2);
    }

    @Test
    public void testAddAtEnd01() throws Exception {

    }

    @Test
    public void testAddAt() throws Exception {

    }

    @Test
    public void testRemoveFirst() throws Exception {

    }

    @Test
    public void testRemoveLast() throws Exception {

    }

    @Test
    public void testRemoveAt() throws Exception {

    }
}