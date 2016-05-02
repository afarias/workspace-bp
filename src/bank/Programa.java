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


        int reponse3;
        do {
            String question3 = "Que desea hacer\n" +
                    "1.- Consultar Saldo\n" +
                    "2.- Depositar dinero\n" +
                    "3.- Retirar dinero\n" +
                    "4.- Terminar programa\n";

            reponse3 = anInquisitor.askQuestion(question3, 1, 4);

            switch (reponse3) {
                case 1:
                    balance = myATM.consult(account);
                    System.out.println("Su saldo es: " + balance + "\n");
                    break;
                case 2:
                    String questionDeposit = "Cuanto desea depositar?";
                    int deposit = anInquisitor.askQuestion(questionDeposit, 0);
                    myATM.deposit(account, deposit);
                    break;
                case 3:
                    String questionWithdrawal = "Cuanto desea retirar?";
                    int withdrawal = anInquisitor.askQuestion(questionWithdrawal, 0);
                    try {
                        myATM.withdrawal(account, withdrawal);
                    } catch (WithdrawallTooBigException we) {
                        System.out.println("T'as pas assez de pognon, espèce de clodo !\n");
                        break;
                    }

                    System.out.println("Usted ha retirado " + withdrawal);
                    break;
                    }

        } while (reponse3 != 4);
        System.out.println("Hasta luego!");
    }
}
