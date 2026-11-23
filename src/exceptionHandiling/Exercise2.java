package exceptionHandiling;

/*
Exercise 2: Handle ArithmeticException
Unchecked Exception
Problem: Create a method that accepts two numbers and handles division by zero.
 */


public class Exercise2 {

    public static void divide(int a, int b) {

        try {

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {

        divide(20, 5);

        divide(10, 0);

        System.out.println("Program completed.");
    }
}


/*
Explanation:
- First method call: 20 / 5 = 4.
- Second method call: 10 / 0 causes ArithmeticException.
- The catch block handles the exception.
- Program execution continues.
Important: The compiler doesn't force you to handle ArithmeticException
 */