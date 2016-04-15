package strings;

/**
 * Created by Admin on 11/04/2016.
 */
public class WordUtilityInheritanceImpl extends WordUtilityJeanImpl implements IWordUtility {

    private static final char APOSTROPHE = '\'';

    @Override
    public String lipotimia(String line) {

        int firstChar = line.indexOf(APOSTROPHE);
        char secondChar;
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
            String aString = Character.toString((char)firstChar);
            newLine = newLine.concat(aString);
        }

        return newLine.concat(lipotimia(line.substring(1)));
    }
}
