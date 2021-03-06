import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount bankAccount;


    @Test
    public void shouldKeepMinimumBalanceOf100() {
        bankAccount = new BankAccount(1000, 100);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.withdraw(1000);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void shouldKeepMinimumBalanceOf200() {
        bankAccount = new BankAccount(1000, 200);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.withdraw(900);
        assertEquals(1000, bankAccount.getBalance());
    }


    @Test
    public void shouldNotWithdraw500WhenWeHave0Balance() {
        bankAccount = new BankAccount(0, 0);
        assertEquals(0, bankAccount.getBalance());
        bankAccount.withdraw(500);
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void shouldWithdraw500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000, 0);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.withdraw(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    public void shouldNotWithdrawNegative500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000, 0);
        assertEquals(1000, bankAccount.getBalance());

        bankAccount.withdraw(-500);
        assertEquals(1000, bankAccount.getBalance());
    }


    @Test
    public void shouldNotDepositNegative500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000, 0);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.deposit(-500); // nothing should happend since negative is not allowed
        assertEquals(1000, bankAccount.getBalance());
    }


    @Test
    public void shouldDeposit500WhenWeHave1000Balance() {
        bankAccount = new BankAccount(1000, 0);
        assertEquals(1000, bankAccount.getBalance());
        bankAccount.deposit(500);
        assertEquals(1500, bankAccount.getBalance());
    }
}
