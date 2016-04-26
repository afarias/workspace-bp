package bank;

/**
 * Created by Admin on 18/04/2016.
 */
public class NormalAccount extends CreditAccount implements IAccount {

    /**
     * This method ONLY IF amount is > 0
     * @param amount
     */
    @Override
    public void decrease(int amount) throws WithdrawallTooBigException {

        if(this.balance < amount)
            throw new WithdrawallTooBigException();

        this.balance -= amount;
        if (balance < 0) System.out.println("Ce compte ne fait pas crédit");
    }
}
