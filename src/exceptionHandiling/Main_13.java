package exceptionHandiling;


import java.sql.SQLException;

class BankAccount {

    private double balance = 10000;

    public void withdraw(double amount) throws SQLException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance"
            );
        }

        // Imagine a database operation here.
        // It can throw SQLException.

        balance -= amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

public class Main_13 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {

            account.withdraw(2000);

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid withdrawal: " + e.getMessage());

        }
    }
}


/*

Real-world example: Both exceptions together

create a small banking application.

Imagine a user wants to withdraw money from a bank account.

There are two possible problems:
1. The database connection fails. (Checked exception)
2. The withdrawal amount is invalid. (Unchecked exception
 */