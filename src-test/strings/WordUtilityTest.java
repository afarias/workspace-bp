package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordUtilityTest {

    private WordUtility aWordUtility = new WordUtility();

    @Test
    public void testIsPalindrome01() throws Exception {

        boolean isPalindrome = aWordUtility.isPalindrome("oso");

        assertEquals(true, isPalindrome);
    }
    @Test
    public void testIsPalindrome02() throws Exception {

        boolean isPalindrome = aWordUtility.isPalindrome("atina");

        assertEquals(false, isPalindrome);
    }

    @Test
    public void testIsPalindrome03() throws Exception {

        boolean isPalindrome = aWordUtility.isPalindrome("anita lava la tina", true);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testIsPalindrome04() throws Exception {

        boolean isPalindrome = aWordUtility.isPalindrome("anita lava la tina", ' ');

        assertEquals(true, isPalindrome);

    }
}