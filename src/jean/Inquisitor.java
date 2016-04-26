package jean;

import java.util.Scanner;

/**
 * Created by Admin on 05/04/2016.
 */


public class Inquisitor {
    public int askQuestion(String question, int startRange) throws TooBigForIntegerException {
        try {
            return askQuestion(question, startRange, Integer.MAX_VALUE);
        } catch (TooBigForIntegerException we) {
            return askQuestion(question, startRange, Integer.MAX_VALUE - 1);
        }
    }


    /**
     * This method is responsible for getting a valid numerical response after asking a question.
     *
     * @param question   The question that will be asked to the user
     * @param startRange The minimal value of answer
     * @param endRange   The maximal value of answer
     * @return The valid numeric int answer choose by the user
     */
    // TODO Régler ca pour pas que l'array soit trop grand !
    public int askQuestion(String question, int startRange, int endRange) throws TooBigForIntegerException {
        int myArraySize = endRange - startRange + 1;
        if (myArraySize < 0)
            throw new TooBigForIntegerException();
        // we are creating an array to store all the possible answers.
        String myArray[] = new String[myArraySize];
        // we fill the array
        for (int i = 0; i < myArraySize; i++) {
            myArray[i] = Integer.toString(startRange + i);
        }
        String theStringAnswer = askQuestion(question, myArray);
        return Integer.parseInt(theStringAnswer);
    }

    /**
     * This method is responsible for getting a valid response after asking a question.
     * By default this method is sensitive to Case.
     *
     * @param question The question that will be asked to the user
     * @param answer   The set of valid answers
     * @return The valid answer choose by the user
     */
    public String askQuestion(String question, String answer[]) {
        return askQuestion(question, answer, true);
    }

    /**
     * This method is responsible for getting a valid response after asking a question.
     *
     * @param question        The question that will be asked to the user
     * @param answer          The set of valid answers
     * @param isSensitiveCase Specifies wenether the parameters and the return are sensitive case.
     * @return
     */
    public String askQuestion(String question, String answer[], boolean isSensitiveCase) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        String userInput;

        do { // The program will test all possible answers until he find one valid.
            System.out.println(question);
            userInput = sc.nextLine();
            for (i = 0; i < answer.length; i++)
                if (isSensitiveCase) {
                    if (userInput.equals(answer[i])) {
                        isValid = true;
                        break;
                    }
                } else if (userInput.equalsIgnoreCase(answer[i])) {
                    isValid = true;
                    break;
                }
        } while (!isValid);

        return userInput;
    }

}

