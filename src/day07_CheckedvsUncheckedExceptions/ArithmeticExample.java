package day07_CheckedvsUncheckedExceptions;

/*
ArithmeticException – Runtime Check by JVM
Concept
Some validations are done only at runtime.

 */

public class ArithmeticExample {

    public static void main(String[] args) {
        int result = 10 / 0;
        System.out.println(result);
    }
}

//Explanation

//Compiler cannot know divisor value
//JVM checks at runtime
//Throws ArithmeticException

//Interview Line
//ArithmeticException is JVM-thrown, not compiler-detected.