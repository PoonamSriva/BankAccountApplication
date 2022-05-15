public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
        }

    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (balance - amount >= 0) {
                balance = balance - amount;
            }
        }


    }

    public double getBalance() {
        return balance;
    }

}

