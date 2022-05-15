import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount bankAccount;

    @Test
    public void shouldWithdraw500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.withdraw(500);
        assertEquals(500, bankAccount.getBalance());
    }


    @Test
    public void shouldDeposit500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.deposit(500);
        assertEquals(1500, bankAccount.getBalance());
    }
}
