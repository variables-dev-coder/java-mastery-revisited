package exceptionHandiling;

/*
Exercise 1: Handle FileNotFoundException
Checked Exception
Problem: Create a program that reads a file using FileReader and handles FileNotFoundException
 */


import java.io.FileReader;
import java.io.FileNotFoundException;

public class Exercise1 {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data.txt");

            System.out.println("File opened successfully!");

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found!");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }
}

/*
Explanation:
- FileReader attempts to open the file.
- If the file doesn't exist, Java throws FileNotFoundException.
- catch handles the exception.
- The program continues executing.
Remember: FileNotFoundException is a Checked Exception because the compiler forces you to handle or declare it.
 */