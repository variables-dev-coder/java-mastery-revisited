package exceptionHandiling;


/*
Exercise 6: Declare SQLException using throws
Checked Exception
Problem: Create a method that declares SQLException using throws and handle it in main().

This is particularly important for JDBC and database development.
 */

import java.sql.SQLException;

public class Exercise6 {

    public static void connectDatabase() throws SQLException {

        System.out.println("Connecting to database...");

        throw new SQLException("Database connection failed!");
    }

    public static void main(String[] args) {

        try {

            connectDatabase();

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}

/*
Explanation:

Let's understand the execution:
  1. connectDatabase() declares throws SQLException.
  2. The method explicitly throws an SQLException.
  3. main() calls connectDatabase().
  4. The catch block handles the SQLException.
  5. The program continues.
  
Note: This example simulates a database failure. It doesn't establish an actual database connection.

 */