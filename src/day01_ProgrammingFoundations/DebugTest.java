package day01_ProgrammingFoundations;


/*
8. Basic Debugging & Errors
---------------------------
Compile-Time Errors
-------------------
    Missing semicolon
    Type mismatch
    Unreachable code

Runtime Errors
--------------
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException

 */


public class DebugTest {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());  // NullPointerException
    }
}
