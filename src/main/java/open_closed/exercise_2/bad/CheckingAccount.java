package open_closed.exercise_2.bad;

import java.util.UUID;

public class CheckingAccount extends Account{
    private static final double WITHDRAW_FEE = 0.15;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public double withdraw(double amount) {
        double amountAfterFees = amount + WITHDRAW_FEE;
        balance -= amountAfterFees;
        return balance;
    }

    public double applyInterest(int numberOfMonths) {
        return balance;
    }
}
