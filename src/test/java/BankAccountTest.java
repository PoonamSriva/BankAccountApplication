import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount();

    @Test
    public void shouldWithdraw500WhenWeHave1000Balance(){
        bankAccount.withdraw(1000);
        assertEquals(500, bankAccount.getBalance());
    }


    @Test
    public void shouldDeposit500WhenWeHave1000Balance(){
        bankAccount.deposit(500);
        assertEquals(1500, bankAccount.getBalance());
    }

}