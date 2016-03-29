package controlStructures;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    private Math math = new Math();

    @Test
    public void testIsPrime01() throws Exception {

        boolean result = math.isPrime(0);

        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsPrime02() throws Exception {
        boolean result = math.isPrime(1);

        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsPrime03() throws Exception {
        boolean result = math.isPrime(2);

        Assert.assertEquals(true, result);
    }

    @Test
    public void testIsPrime04() throws Exception {
        boolean result = math.isPrime(331);

        Assert.assertEquals(true, result);
    }

    @Test
    public void testIsPrime05() throws Exception {
        boolean result = math.isPrime(333);

        Assert.assertEquals(false, result);
    }
}