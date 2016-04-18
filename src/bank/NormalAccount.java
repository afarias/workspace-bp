package bank;

/**
 * Created by Admin on 18/04/2016.
 */
public class NormalAccount implements IAccount {

    private int balance;

    public NormalAccount() {
        this.balance = 0;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void decrease(int amount) {

    }

    @Override
    public void increase(int amount) {

    }
}
