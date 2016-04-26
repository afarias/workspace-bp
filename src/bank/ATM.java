package bank;

/** This class is responsible for interfacing between the user and the accounts.
 * Created by Admin on 18/04/2016.
 */
public class ATM {
    /**
     * This method is responsible for creating a new normal account
     * @return
     */
    public NormalAccount createNormalAccount() {
        return new NormalAccount();
    }

    /**
     *
     * This method is responsible for creating a new credit account
     * @return
     */
    public CreditAccount createCreditAccount() {
        return new CreditAccount();
    }

    /**
     * This method is responsible for getting the actual balance of an Account
     * @param account The account we want to know the balance
     * @return The actual balance of the account
     */
    public int consult(IAccount account) {
        return account.getBalance();
    }

    /**
     * This method is responsible for depose an amount on money in the selected account
     * @param account The account we want to know the balance
     * @param deposit The amount of the deposit
     */
    public void deposit(IAccount account, int deposit) {
        account.increase(deposit);
    }

    /**
     *
     * @param account The account we want to know the balance
     * @param withdrawal The amount of the withdrawal

     */
    public void withdrawal(IAccount account, int withdrawal) throws WithdrawallTooBigException {
        account.decrease(withdrawal);
    }
}
