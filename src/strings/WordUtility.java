package strings;

import java.util.Scanner;

/**
 * Created by Andres Farías
 */
public class WordUtility {

    /**
     * <p>
     * This method is responsible for determining whether a given <code>word</code> is palindrome or not.
     *
     * @param word The word to be checked to be palindrome.
     * @return <code>true</code> if the <code>word</code> is palindrome and  <code>false</code> otherwise.
     */
    public boolean isPalindrome(String word) {
        int lengthWord = word.length();
        // je teste la condition d'arrêt
        if (lengthWord < 2)
            return true;
        // je teste les deux bornes
        char premierCaractere, dernierCaractere;
        premierCaractere = word.charAt(0);
        dernierCaractere = word.charAt(lengthWord - 1);
        if (premierCaractere != dernierCaractere)
            return false;
            // Je vire les deux bornes
        else
            return isPalindrome(word.substring(1, lengthWord - 1));
        // je rapelle la méthode
//        int i;
        // This will test every letter with the ultimate in order.
//        for (i = 0; i < lengthWord / 2; i++) {
//            char currentLetter = word.charAt(i);
//            char testedLetter = word.charAt(lengthWord - i - 1);
//            if (currentLetter != testedLetter)
//                return false;
////        }
//
//        return true;
    }

    /**
     * <p>
     * This method is responsible for determining whether a given <code>string</code> is palindrome or not, considering
     * or not the spaces that separate words.
     *
     * @param line         The line to be checked to be palindrome.
     * @param ignoreSpaces Specifies if <code>true</code> the spaces must be ignored in order to check if the line is
     *                     palindrome.
     * @return <code>true</code> if the <code>word</code> is palindrome and  <code>false</code> otherwise.
     */
    public boolean isPalindrome(String line, boolean ignoreSpaces) {
        int i = 0;
        int lengthLine = line.length();
        /* If there is space un the string, we remove the spaces */
        if (ignoreSpaces == true) {
            String lineWithoutSpace = line.replaceAll(" ", "");
            return isPalindrome(lineWithoutSpace);
        } else
            return isPalindrome(line);

    }

    /**
     * <p>
     * This method is responsible for determining whether a given <code>string</code> is palindrome or not, considering
     * or not a given character, such as the space character.
     *
     * @param line        The line to be checked to be palindrome.
     * @param ignoredChar The custom char that should be ignored in order to determine the palindrome nature of the
     *                    line.
     * @return <code>true</code> if the <code>line</code> is palindrome and  <code>false</code> otherwise.
     */

    public boolean isPalindrome(String line, char ignoredChar) {
        int i = 0;
        int lengthLine = line.length();
        String ignoredString = Character.toString(ignoredChar);
        /* we remove the ignored Char */
            String lineWithoutChar = line.replaceAll(ignoredString, "");
            return isPalindrome(lineWithoutChar);
    }
}
