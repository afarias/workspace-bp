package jean;

/**
 * Created by Admin on 05/04/2016.
 */
public class Interface {

    /**
     * This method is responsible for getting a valid response after asking a question.
     * By default this method is sensitive to Case.
     * @param question The question that will be asked to the user
     * @param answer The set of valid answers
     * @return The valid answer choose by the user
     */
    public String askQuestion(String question, String answer[]){
        return null;
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

