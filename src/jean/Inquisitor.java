package jean;

import java.util.Scanner;

/**
 * Created by Admin on 05/04/2016.
 */


public class Inquisitor {
    public int askQuestion(String question, int startRange) {
        return askQuestion(question, startRange, Integer.MAX_VALUE);
    }


    /**
     * This method is responsible for getting a valid numerical response after asking a question.
     *
     * @param question   The question that will be asked to the user
     * @param startRange The minimal value of answer
     * @param endRange   The maximal value of answer
     * @return The valid numeric int answer choose by the user
     */

    public int askQuestion(String question, int startRange, int endRange) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        boolean isValid;


        // The program will test if the Integer is included in the range of possible answers
        do {
            System.out.println(question);
            userInput = sc.nextInt();
            isValid = (userInput >= startRange && userInput <= endRange);
            if (isValid) {
                break;
            }
        } while (!isValid);
        return userInput;
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

