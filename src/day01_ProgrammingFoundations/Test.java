package day01_ProgrammingFoundations;



/*
Java Syntax & Structure
-----------------------
Interview Questions
--------------------
    1. Why is main method public static?
    2. What happens if main is not static?
    3. Can we overload main?
    4. Why is class name same as file name?
    5. What is the execution flow of a Java program?


 */


public class Test {
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}

//static block
//Main Method