package constructor;


class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    // 1. No-argument constructor
    BankAccount() {
        this(1000, "Unknown", 0.0);
        System.out.println("Default account created");
    }

    // 2. Parameterized constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // 3. Constructor overloading
    BankAccount(int accountNumber, String accountHolder) {
        this(accountNumber, accountHolder, 500.0);
    }

    // 4. Copy constructor
    BankAccount(BankAccount other) {
        this(other.accountNumber, other.accountHolder, other.balance);
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
}

public class BankAccountConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        BankAccount a1 = new BankAccount();
        a1.display();

        // Parameterized constructor
        BankAccount a2 = new BankAccount(1001, "Munna", 5000);
        a2.deposit(1000);
        a2.withdraw(500);
        a2.display();

        // Constructor with two parameters
        BankAccount a3 = new BankAccount(1002, "Rahul");
        a3.display();

        // Copy constructor
        BankAccount a4 = new BankAccount(a2);
        a4.display();
    }
}

