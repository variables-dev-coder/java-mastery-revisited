package exceptionRevision;

import java.util.*;

// Custom Checked Exceptions
class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, BankAccount> accounts = new HashMap<>();

        accounts.put("123", new BankAccount("123", 5000));

        try {
            performWithdrawal(accounts, "123", 6000);
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Transaction attempt finished.");
        }
    }

    public static void performWithdrawal(
            Map<String, BankAccount> accounts,
            String accNumber,
            double amount
    ) throws Exception {

        try {

            if (!accounts.containsKey(accNumber)) {
                throw new AccountNotFoundException("Account does not exist.");
            }

            BankAccount account = accounts.get(accNumber);

            account.withdraw(amount);

        } catch (InvalidAmountException |
                 InsufficientFundsException |
                 AccountNotFoundException e) {

            // Exception chaining
            throw new Exception("High-level transaction error.", e);
        }
    }
}
