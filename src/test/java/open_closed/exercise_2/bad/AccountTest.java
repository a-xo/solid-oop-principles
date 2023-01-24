package open_closed.exercise_2.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void itShouldMakeADeposit() {
        Account account = new BasicAccount(100.0);

        assertEquals(150.0, account.deposit(50.0));
    }

    @Test
    public void itShouldTransferMoneyToAnotherAccount() {
        Account basicAccount = new BasicAccount(100.0);
        Account anotherAccount = new BasicAccount(100.0);

        assertEquals(88.5, basicAccount.transfer(10.0, anotherAccount));
    }

}