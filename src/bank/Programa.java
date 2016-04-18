package bank;

import jean.Inquisitor;

/**
 * Created by Admin on 18/04/2016.
 */
public class Programa {

    public static void main(String[] args) {

        ATM myATM = new ATM();

        String question = "Bienvenido al Banco Virtual\n" +
                "Que tipo de cuenta desea crear? \n" +
                "1.- Cuenta Normal;\n" +
                "2.- Cuenta Credito";

        Inquisitor anInquisitor = new Inquisitor();
        String[] answers = {"1", "2"};
        String theAnswer = anInquisitor.askQuestion(question, answers);

        IAccount account = null;
        switch (theAnswer) {
            case "1":
                account = myATM.createNormalAccount();
                break;
            case "2":
                account = myATM.createCreditAccount();
        }


        String question2 = "Saldo inicial?";
        int balance = anInquisitor.askQuestion(question2, 0);
        account.setBalance(balance);
    }
}
