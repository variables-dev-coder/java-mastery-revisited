package day07_CheckedvsUncheckedExceptions;

/*
Checked Exception – Compilation Failure (Core Proof)
Concept
Checked exceptions are enforced by the compiler.
Code (Compilation Fails)
 */

import java.io.FileReader;

public class CheckedExceptionFail {

    public static void main(String[] args) {
       // FileReader reader = new FileReader("data.txt"); // Compiler Error
    }
}

// Unhandled exception: java.io.FileNotFoundException

//Explanation

//FileReader declares it may throw FileNotFoundException
//This is a checked exception
//Compiler forces handling because:
//File system is external
//JVM cannot guarantee safety

//Interview Line
//Checked exceptions represent risks outside JVM control.