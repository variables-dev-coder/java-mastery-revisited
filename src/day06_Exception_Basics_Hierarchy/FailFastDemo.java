package day06_Exception_Basics_Hierarchy;

// Proving JVM Stops Execution (Fail-Fast)

public class FailFastDemo {

    public static void main(String[] args) {
        System.out.println("Program Started...");

        int result = 10 / 0;  // exception occurs here

        System.out.println("This Line NEVER execute");
    }
}

//Program started
//Exception in thread "main" java.lang.ArithmeticException: / by zero

// JVM does not continue execution.