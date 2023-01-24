package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    @Test
    public void itShouldCreateACheckingAccount() {
        Account checkingAccount = new CheckingAccount(100.0);

        assertEquals(100.0, checkingAccount.getBalance());
    }

    @Test
    public void itShouldApplyInterest() {
        Account checkingAccount = new CheckingAccount(100.0);

        assertEquals(100.0, checkingAccount.applyInterest(12));
    }

    @Test
    public void itShouldWithdrawMoneyFromCheckingAccount() {
        Account checkingAccount = new CheckingAccount(100.0);

        assertEquals(89.85, checkingAccount.withdraw(10.0));
    }
}