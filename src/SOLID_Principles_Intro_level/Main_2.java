package SOLID_Principles_Intro_level;

// 1. Single Responsibility Principle (SRP)

// Example 2: Banking System


class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

class TransactionService {

    public void deposit(BankAccount account, double amount) {
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(BankAccount account, double amount) {
        System.out.println("Withdrawn: " + amount);
    }
}

class AccountStatement {

    public void generate(BankAccount account) {
        System.out.println("Account: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}

public class Main_2 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Munna", 50000);

        TransactionService service = new TransactionService();
        AccountStatement statement = new AccountStatement();

        service.deposit(account, 5000);
        service.withdraw(account, 2000);

        statement.generate(account);
    }
}
