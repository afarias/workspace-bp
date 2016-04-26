package bank;

/**
 *
 * Created by Admin on 18/04/2016.
 */
public interface IAccount {

    /**
     *
     * @param balance
     */
    void setBalance(int balance);

    void decrease(int amount) throws WithdrawallTooBigException;
    void increase(int amount);

    int getBalance();
}
