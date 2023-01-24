package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearlyInterestAccountTest {
    @Test
    public void itShouldCreateAYearlyInterestAccount() {
        Account yearlyInterestAccount = new YearlyInterestAccount(100.0);

        assertEquals(100.0, yearlyInterestAccount.getBalance());
    }

    @Test
    public void itShouldApplyInterest() {
        Account yearlyInterestAccount = new YearlyInterestAccount(100.0);

        assertEquals(105.0, yearlyInterestAccount.applyInterest(1));
    }

    @Test
    public void itShouldWithdrawMoneyFromYearlyInterestAccount() {
        Account yearlyInterestAccount = new YearlyInterestAccount(100.0);

        assertEquals(88.5, yearlyInterestAccount.withdraw(10.0));
    }
}