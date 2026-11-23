package exceptionHandiling;

class BankAccount2 {

    private double balance = 5000;

    public void withdraw(double amount) {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient account balance!"
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");

        System.out.println("Remaining Balance: " + balance);
    }
}

public class Exercise5 {

    public static void main(String[] args) {

        BankAccount2 account = new BankAccount2();

        try {

            account.withdraw(2000);

            account.withdraw(7000);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Transaction completed.");
    }
}

/*
Explanation:
- Initial balance = ₹5,000.
- First withdrawal = ₹2,000.
- Remaining balance = ₹3,000.
- Second withdrawal = ₹7,000.
- Since ₹7,000 is greater than ₹3,000, the exception is thrown.
Remember:
extends RuntimeException
 */