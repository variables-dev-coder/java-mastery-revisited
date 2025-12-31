package day01_ProgrammingFoundations;

/*
4. Operators
------------
Interview Questions
-------------------
    1. Difference between & and &&
    2. Difference between | and ||
    3. What is short-circuiting?
    4. Why == is dangerous for objects?
    5. Bitwise operators real use cases?

 */


public class OperatorTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(a++ + ++a); // 12
        System.out.println(a > b && ++b > a); // false
        System.out.println(b); // 10
    }
}
