package strings;

/**
 * Created by Andres Farías
 */
public class WordUtilityJeanImpl implements IWordUtility {

    /**
     * <p>
     * This method is responsible for determining whether a given <code>word</code> is palindrome or not.
     *
     * @param word The word to be checked to be palindrome.
     * @return <code>true</code> if the <code>word</code> is palindrome and  <code>false</code> otherwise.
     */
    @Override
    public boolean isPalindrome(String word) {
        int lengthWord = word.length();
        // Testing the stop case
        if (lengthWord < 2)
            return true;
        // Comparing the both edges
        char premierCaractere, dernierCaractere;
        premierCaractere = word.charAt(0);
        dernierCaractere = word.charAt(lengthWord - 1);
        if (premierCaractere != dernierCaractere)
            return false;
            // Removing the edges tested
        else
            return isPalindrome(word.substring(1, lengthWord - 1));
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
    @Override
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

    @Override
    public boolean isPalindrome(String line, char ignoredChar) {

        String ignoredString = Character.toString(ignoredChar);

        /* we remove the ignored Char */
        return isPalindrome(line.replaceAll(ignoredString, ""));
    }

    /**
     * <p>
     * This method is responsible for adding  in a given <code>String</code> an accent to a vocal if preceded by
     * an apostrophe and remove the apostrophe if there is more than one.
     *
     * @param line The line to be changed.
     * @return The modified line.
     */

    @Override
    public String lipotimia(String line) {
        char firstChar, secondChar;
        int lengthLine = line.length();
        String newLine = "";

        /* Set the condition to exit the recursive loop: If there are less than two chars, there is nothing left to be done. */
        if (lengthLine < 2) {
            return newLine.concat(line);
        }

        // The program reads the 2 next characters and do the modifications expected.
        firstChar = line.charAt(0);
        secondChar = line.charAt(1);

        if (firstChar == '\'') {

            if (isSpecialChar(secondChar)) {
            /* If there is vocal next, the substitution is made */
                if (secondChar == 'a') {
                    newLine = newLine.concat("á");
                } else if (secondChar == 'A') {
                    newLine = newLine.concat("Á");
                } else if (secondChar == 'e') {
                    newLine = newLine.concat("é");
                } else if (secondChar == 'E') {
                    newLine = newLine.concat("É");
                } else if (secondChar == 'i') {
                    newLine = newLine.concat("í");
                } else if (secondChar == 'I') {
                    newLine = newLine.concat("Í");
                } else if (secondChar == 'o') {
                    newLine = newLine.concat("ó");
                } else if (secondChar == 'O') {
                    newLine = newLine.concat("Ó");
                } else if (secondChar == 'u') {
                    newLine = newLine.concat("ú");
                } else if (secondChar == 'U') {
                    newLine = newLine.concat("Ú");
                } else if (secondChar == 'y') {
                    newLine = newLine.concat("ý");
                } else if (secondChar == 'Y') {
                    newLine = newLine.concat("Ý");
                } else if (secondChar == '\'') {
                    newLine = newLine.concat("'");
                }

                return newLine.concat(lipotimia(line.substring(2)));
            }

        } else {
            String aString = Character.toString(firstChar);
            newLine = newLine.concat(aString);
        }

        return newLine.concat(lipotimia(line.substring(1)));

    }

    /**
     * @param aChar
     * @return
     */
    protected boolean isSpecialChar(char aChar) {

        return ((aChar == 'a') | (aChar == 'A') | (aChar == 'e') | (aChar == 'E') | (aChar == 'i') | (aChar == 'I')
                | (aChar == 'o') | (aChar == 'O') | (aChar == 'u') | (aChar == 'U') | (aChar == 'y') | (aChar == 'Y')
                | (aChar == '\''));
    }
}