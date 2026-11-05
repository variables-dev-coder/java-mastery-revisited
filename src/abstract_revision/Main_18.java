package abstract_revision;

interface Transaction {

    void deposit(double amount);

    void withdraw(double amount);
}

abstract class BankAccount implements Transaction {

    private long accountNumber;
    protected double balance;

    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    abstract void calculateInterest();

    void displayBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest: " + balance * 0.04);
    }
}

public class Main_18 {

    public static void main(String[] args) {

        BankAccount account = new SavingsAccount(12345, 10000);

        account.deposit(5000);
        account.withdraw(2000);

        account.displayBalance();
        account.calculateInterest();
    }
}
