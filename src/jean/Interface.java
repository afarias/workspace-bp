package jean;

import java.util.Scanner;

/**
 * Created by Admin on 05/04/2016.
 */
public class Interface {

    public static void main(String[] args) {
        String question1 = "Y/N ?";
        String answers[] = {"Y", "N"};
        Interface anInterface = new Interface();

        String userAnswer = anInterface.askQuestion(question1,answers);
        System.out.println(userAnswer);
    }

    /**
     * This method is responsible for getting a valid response after asking a question.
     * By default this method is sensitive to Case.
     * @param question The question that will be asked to the user
     * @param answer The set of valid answers
     * @return The valid answer choose by the user
     */
    public String askQuestion(String question, String answer[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        String userInput;
        do { // The program will test all possible answers until he find one valid.
            System.out.println(question);
            userInput = sc.nextLine();
            for (i = 0; i <= answer.length; i++)
                if (userInput.equals(answer[i])){
                    isValid = true;
                    break;
                }
        } while (!isValid);

        return userInput;
    }

    /**
     * This method is responsible for getting a valid response after asking a question.
     * @param question The question that will be asked to the user
     * @param answer The set of valid answers
     * @param isSensitiveCase Specifies wether the parameters and the returne are sensitive case.
     * @return
     */
    public String askQuestion(String question, String answer[], boolean isSensitiveCase){
        return null;
    }

}

