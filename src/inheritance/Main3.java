package inheritance;


class BankAccount {

    protected String accountHolder;
    protected double balance;

    // Parent constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Common inherited method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Child class 1
class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void addInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;

        System.out.println("Interest Added: ₹" + interest);
    }
}

// Child class 2
class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class Main3 {

    public static void main(String[] args) {

        // Savings account
        SavingsAccount savings =
                new SavingsAccount("Rahul", 10000);

        savings.displayBalance();
        savings.deposit(2000);
        savings.addInterest(5);
        savings.displayBalance();

        System.out.println("--------------------");

        // Current account
        CurrentAccount current =
                new CurrentAccount("Amit", 15000);

        current.displayBalance();
        current.deposit(3000);
        current.withdraw(5000);
        current.displayBalance();
    }
}

