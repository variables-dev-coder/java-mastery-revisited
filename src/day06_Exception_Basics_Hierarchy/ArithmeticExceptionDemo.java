package day06_Exception_Basics_Hierarchy;

/*
ArithmeticException – Divide by Zero
Concept

Occurs when an illegal arithmetic operation is detected at runtime.

 */

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int a = 10 / 0;  // illegal arithmetic operation
        System.out.println(a);
    }
}

/*
JVM Behavior
JVM checks divisor at runtime
Throws ArithmeticException
Stops execution immediately

Interview Line
ArithmeticException is thrown by JVM, not by compiler.
 */