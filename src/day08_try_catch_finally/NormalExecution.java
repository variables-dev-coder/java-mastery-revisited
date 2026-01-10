package day08_try_catch_finally;

/*

1.try Block Rules (Risk Zone)
Concept

try defines a protected area where exception may occur.

Invalid Code (Compilation Error)
try {
    int a = 10 / 0;
}

Valid Code
try {
    int a = 10 / 2;
} catch (Exception e) {
    System.out.println("Handled");
}


Rule

try must be followed by catch or finally

 */

public class NormalExecution {

    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            int a = 10 + 20;
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Program continues");
    }
}


//Try block
//Finally block
//Program continues

// Flow
// try → finally → next statements