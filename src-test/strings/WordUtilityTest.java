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
    public void testIsPalindrome05() throws Exception {

        boolean isPalindrome = aWordUtility.isPalindrome("ghtyythg");

        assertEquals(true, isPalindrome);
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

    @Test
    public void testLipotimia() throws Exception {

        String lipotomia = aWordUtility.lipotimia("Ana Mar'ia dej'o su a su ''Chanchito'' vestirse como un '''Angel'''.");

        assertEquals("Ana María dejó su a su 'Chanchito' vestirse como un 'Ángel'.", lipotomia);

    }
}