public class BankAccount {
    private double balance;
    private double minimumBalance;

    public BankAccount() {
        balance = 0;
        minimumBalance = 0;
    }

    public BankAccount(double initialBalance, double minimumBalance) {
        balance = initialBalance;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
        }

    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            if (balance - amount >= minimumBalance) {
                balance = balance - amount;
            }
        }


    }

    public double getBalance() {
        return balance;
    }

}

