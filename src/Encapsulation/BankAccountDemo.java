package Encapsulation;

class BankAccount {

    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException(
                    "Account holder name cannot be blank."
            );
        }

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Initial balance cannot be negative."
            );
        }

        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter: balance can be read, but not assigned directly
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(
                    "Deposit amount must be positive."
            );
            return;
        }

        balance += amount;
        System.out.println("Deposit successful.");
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(
                    "Withdrawal amount must be positive."
            );
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public void displayAccount() {
        System.out.println(
                "Account Holder: " + accountHolder
        );
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Munna", 10000);

        account.displayAccount();

        System.out.println("\n--- Deposit ---");
        account.deposit(2000);
        account.displayAccount();

        System.out.println("\n--- Withdrawal ---");
        account.withdraw(3000);
        account.displayAccount();

        System.out.println("\n--- Invalid Withdrawal ---");
        account.withdraw(50000);
        account.displayAccount();

        System.out.println("\n--- Invalid Deposit ---");
        account.deposit(-500);
        account.displayAccount();
    }
}
