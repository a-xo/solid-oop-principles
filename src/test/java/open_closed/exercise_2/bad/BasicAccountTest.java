package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccountTest {
    @Test
    public void itShouldCreateABasicAccount() {
        Account basicAccount = new BasicAccount(100.0);

        assertEquals(100.0, basicAccount.getBalance());
    }

    @Test
    public void itShouldApplyInterest() {
        Account basicAccount = new BasicAccount(100.0);

        assertEquals(100.0, basicAccount.applyInterest(12));
    }

    @Test
    public void itShouldWithdrawMoneyFromBasicAccount() {
        Account basicAccount = new BasicAccount(100.0);

        assertEquals(89.9, basicAccount.withdraw(10.0));
    }
}