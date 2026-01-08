package day07_CheckedvsUncheckedExceptions;

/*
Unchecked Exception – No Compiler Restriction
Concept
Unchecked exceptions are runtime failures caused by code bugs.
 */

public class UncheckedExample {

    public static void main(String[] args) {
        String value = null;
        System.out.println(value.length());
    }
}

//Explanation

//Compiler allows it
//JVM throws NullPointerException at runtime
//Indicates broken assumption in code

//Golden Rule
//Fix the code, don’t catch RuntimeException blindly.