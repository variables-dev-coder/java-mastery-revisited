package exceptionHandiling;

/*
Exercise 3: Handle NumberFormatException
Unchecked Exception
Problem: Convert a String into an integer. Handle invalid input such as "ABC".
 */


public class Exercise3 {

    public static void convertToInteger(String value) {

        try {

            int number = Integer.parseInt(value);

            System.out.println("Converted Number: " + number);

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid number format!");
        }
    }

    public static void main(String[] args) {

        convertToInteger("100");

        convertToInteger("250");

        convertToInteger("ABC");

        System.out.println("Program completed.");
    }
}


/*

Explanation:

Integer.parseInt() converts a String into an integer.
            Input	Result
            "100"	100
            "250"	250
            "ABC"	NumberFormatException
            "12.5"	NumberFormatException

Why?

Because "ABC" and "12.5" cannot be converted into integer values by Integer.parseInt().

 */