package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordUtilityJeanImplTest {

    private IWordUtility aIWordUtility = new WordUtilityJeanImpl();

    @Test
    public void testIsPalindrome01() throws Exception {

        boolean isPalindrome = aIWordUtility.isPalindrome("oso");

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testIsPalindrome02() throws Exception {

        boolean isPalindrome = aIWordUtility.isPalindrome("atina");

        assertEquals(false, isPalindrome);
    }

    @Test
    public void testIsPalindrome05() throws Exception {

        boolean isPalindrome = aIWordUtility.isPalindrome("ghtyythg");

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testIsPalindrome03() throws Exception {

        boolean isPalindrome = aIWordUtility.isPalindrome("anita lava la tina", true);

        assertEquals(true, isPalindrome);
    }

    @Test
    public void testIsPalindrome04() throws Exception {

        boolean isPalindrome = aIWordUtility.isPalindrome("anita lava la tina", ' ');

        assertEquals(true, isPalindrome);

    }

    @Test
    public void testLipotimia() throws Exception {

        String lipotomia = aIWordUtility.lipotimia("Ana Mar'ia dej'o su a su ''Chanchito'' vestirse como un '''Angel'''.");

        assertEquals("Ana María dejó su a su 'Chanchito' vestirse como un 'Ángel'.", lipotomia);

    }
}