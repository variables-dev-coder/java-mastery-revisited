package this_and_static_keywords;


class BankAccount {

    // Instance variables: separate for each object
    int accountNumber;
    String accountHolder;
    double balance;

    // Static variables: shared by all objects
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

        totalAccounts++;
    }

    // Instance method
    void displayAccount() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("---------------------------");
    }

    // Static method
    static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Static method to change the shared bank name
    static void changeBankName(String newName) {
        bankName = newName;
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount a1 =
                new BankAccount(101, "Rahul", 5000);

        BankAccount a2 =
                new BankAccount(102, "Priya", 8000);

        BankAccount a3 =
                new BankAccount(103, "Amit", 12000);

        // Display individual account details
        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();

        // Call a static method using the class name
        BankAccount.displayTotalAccounts();

        // Change shared static variable
        BankAccount.changeBankName("ABC Bank");

        System.out.println("\nAfter changing bank name:");

        a1.displayAccount();
        a2.displayAccount();
    }
}

