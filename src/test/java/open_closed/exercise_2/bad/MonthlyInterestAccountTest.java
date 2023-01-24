package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyInterestAccountTest {
    @Test
    public void itShouldCreateAMonthlyInterestAccount() {
        Account monthlyInterestAccount = new MonthlyInterestAccount(100.0);

        assertEquals(100.0, monthlyInterestAccount.getBalance());
    }

    @Test
    public void itShouldApplyInterest() {
        Account monthlyInterestAccount = new MonthlyInterestAccount(100.0);

        assertEquals(101.0, monthlyInterestAccount.applyInterest(1));
    }

    @Test
    public void itShouldWithdrawMoneyFromMonthlyInterestAccount() {
        Account monthlyInterestAccount = new MonthlyInterestAccount(100.0);

        assertEquals(89.0, monthlyInterestAccount.withdraw(10.0));
    }
}