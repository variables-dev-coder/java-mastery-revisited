package Classes_Objects;

class BankAccount {

    // Properties / Data
    String accountHolder;
    long accountNumber;
    double balance;

    // Behavior / Method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main4 {

    public static void main(String[] args) {

        // Creating first object
        BankAccount account1 = new BankAccount();

        account1.accountHolder = "Rahul";
        account1.accountNumber = 10001;
        account1.balance = 5000;

        // Creating second object
        BankAccount account2 = new BankAccount();

        account2.accountHolder = "Amit";
        account2.accountNumber = 10002;
        account2.balance = 10000;

        // Display account 1
        account1.displayAccount();

        System.out.println();

        // Deposit into account 1
        account1.deposit(2000);

        // Withdraw from account 1
        account1.withdraw(1000);

        System.out.println();

        // Display updated account 1
        account1.displayAccount();

        System.out.println("\n------------------");

        // Display account 2
        account2.displayAccount();
    }
}
