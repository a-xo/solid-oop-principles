package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferWithFeesAccountTest {
    @Test
    public void itShouldCreateATransferWithFeesAccount() {
        Account transferWithFeesAccount = new TransferWithFeesAccount(100.0);

        assertEquals(100.0, transferWithFeesAccount.getBalance());
    }

    @Test
    public void itShouldApplyInterest() {
        Account transferWithFeesAccount = new TransferWithFeesAccount(100.0);

        assertEquals(100.0, transferWithFeesAccount.applyInterest(12));
    }

    @Test
    public void itShouldWithdrawMoneyFromBasicAccount() {
        Account transferWithFeesAccount = new TransferWithFeesAccount(100.0);

        assertEquals(90, transferWithFeesAccount.withdraw(10.0));
    }
}