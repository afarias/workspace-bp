package bank;

/**
 *
 * Created by Admin on 18/04/2016.
 */
public class CreditAccount implements IAccount {

    protected int balance;

    public CreditAccount() {
        this.balance = 0;
    }

    @Override
    public void decrease(int amount) throws WithdrawallTooBigException {
        this.balance -= amount;
    }

    @Override
    public void increase(int amount) {
        this.balance += amount;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
