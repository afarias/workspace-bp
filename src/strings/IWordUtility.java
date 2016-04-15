package strings;

/**
 * Created by Admin on 11/04/2016.
 */
public interface IWordUtility {

    boolean isPalindrome(String word);

    boolean isPalindrome(String line, boolean ignoreSpaces);

    boolean isPalindrome(String line, char ignoredChar);

    String lipotimia(String line);
}
