package open_closed.exercise_2.bad;

import java.util.UUID;

public class TransferWithFeesAccount extends Account{
    private static final double TRANSFER_FEE = 5;

    public TransferWithFeesAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount;
        balance -= amountAfterFees;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }
}
