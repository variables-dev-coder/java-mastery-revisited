package exceptionHandiling;


/*

Exercise 4: Create Custom Checked Exception
Custom Checked Exception
Problem: Create a custom checked exception called InvalidPasswordException.

Solution:

We will create two classes.
 */


public class Exercise4 {

    public static void validatePassword(String password)
            throws InvalidPasswordException {

        if (password.length() < 8) {

            throw new InvalidPasswordException(
                    "Password must contain at least 8 characters"
            );
        }

        System.out.println("Password accepted!");
    }

    public static void main(String[] args) {

        try {

            validatePassword("java123");

        } catch (InvalidPasswordException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            validatePassword("Java12345");

        } catch (InvalidPasswordException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Explanation:

Let's understand the important parts.
1. extends Exception makes it a Checked Exception.
2. super(message) passes the message to the parent exception class.
3. throw explicitly throws our custom exception.
4. throws declares that the method can throw this exception.
5. try-catch handles the exception.
Remember:
extends Exception


= Custom Checked Exception.
 */