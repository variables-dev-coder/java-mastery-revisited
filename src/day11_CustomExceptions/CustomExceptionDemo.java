package day11_CustomExceptions;

// =====================
// Custom Exceptions
// =====================

class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// =====================
// Service Layer
// =====================

class UserService {

    public void findUser(String userId) {
        if (userId == null || userId.trim().isEmpty()) {
            throw new InvalidUserException("User ID cannot be null or empty");
        }

        // Simulating user not found
        throw new InvalidUserException("User not found with ID: " + userId);
    }
}

class BankService {

    public void withdraw(double balance, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available: " + balance
            );
        }

        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }
}

// =====================
// Controller / Main Layer
// =====================

public class CustomExceptionDemo {

    public static void main(String[] args) {

        UserService userService = new UserService();
        BankService bankService = new BankService();

        System.out.println("---- USER SERVICE TEST ----");
        try {
            userService.findUser("");
        } catch (InvalidUserException e) {
            System.out.println("User Error: " + e.getMessage());
        }

        System.out.println("\n---- BANK SERVICE TEST ----");
        try {
            bankService.withdraw(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("System Error");
        }

        System.out.println("\nApplication finished safely");
    }
}

//---- USER SERVICE TEST ----
//User Error: User ID cannot be null or empty

//---- BANK SERVICE TEST ----
//Transaction Failed: Insufficient balance. Available: 5000.0

//Application finished safely