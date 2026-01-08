package day07_CheckedvsUncheckedExceptions;


/*
Handling Checked Exception using try-catch
Concept
Use try-catch when you can recover or respond.
 */

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedTryCatch {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println("File not found, using fallback");
        }
    }
}

// File not found, using fallback

//Explanation

//Exception handled locally
//Program continues safely
//Control flow remains predictable

//Industry Rule
//Use try-catch only when you know how to handle the failure.

