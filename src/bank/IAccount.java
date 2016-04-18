package bank;

/**
 * Created by Admin on 18/04/2016.
 */
public interface IAccount {

    /**
     *
     * @param balance
     */
    void setBalance(int balance);

    void decrease(int amount);
    void increase(int amount);
}
