package open_closed.exercise_2.bad;

import java.util.UUID;

public abstract class Account {
    private final UUID accountId;
    public double balance;
    private static double TRANSFER_FEE;

    public Account(double balance) {
        this.balance = balance;
        accountId = UUID.randomUUID();
    }

    public UUID getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double transfer(double amount, Account toAccount){
        double amountAfterFees = amount + TRANSFER_FEE;
        balance -= amountAfterFees;
        toAccount.deposit(amount);
        return balance;
    }

    public abstract double applyInterest(int numberOfMonths);
    public abstract double withdraw(double amount);
}
