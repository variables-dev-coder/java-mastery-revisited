package day07_CheckedvsUncheckedExceptions;

/*
Handling Checked Exception using throws
Concept
Use throws to delegate responsibility to the caller.
 */

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedThrows {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
        System.out.println("File opened");
    }
}

// Explanation

//No handling here
//Caller must handle it
//Compiler is satisfied

//Interview Line
//throws does not handle exceptions, it only propagates them.