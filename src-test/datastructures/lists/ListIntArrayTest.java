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

    @Test
    public void testIsFull() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testCapacity() throws Exception {

    }

    @Test
    public void testAddAtBeginning() throws Exception {

    }

    @Test
    public void testAddAtEnd() throws Exception {

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