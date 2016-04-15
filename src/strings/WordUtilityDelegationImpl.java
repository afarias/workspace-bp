package strings;

/**
 * Created by Admin on 11/04/2016.
 */
public class WordUtilityDelegationImpl implements IWordUtility {

    private WordUtilityJeanImpl wordUtilityDelegator = new WordUtilityJeanImpl();

    @Override
    public boolean isPalindrome(String word) {
        return wordUtilityDelegator.isPalindrome(word);
    }

    @Override
    public boolean isPalindrome(String line, boolean ignoreSpaces) {
        return wordUtilityDelegator.isPalindrome(line, ignoreSpaces);
    }

    @Override
    public boolean isPalindrome(String line, char ignoredChar) {
        return wordUtilityDelegator.isPalindrome(line,  ignoredChar);
    }

    @Override
    public String lipotimia(String line) {
       return wordUtilityDelegator.lipotimia(line);
    }
}
