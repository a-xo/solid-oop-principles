package open_closed.exercise_2.bad;

import java.util.UUID;

public class BasicAccount extends Account{

    private static final double WITHDRAW_FEE = 0.1;
    private static final double TRANSFER_FEE = 1.5;

    public BasicAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }
}
