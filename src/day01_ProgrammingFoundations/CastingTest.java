package day01_ProgrammingFoundations;

/*
3. Type Casting (Implicit & Explicit)
-------------------------------------
Interview Questions
-------------------
    1. What is widening casting?
    2. Why narrowing needs explicit cast?
    3. Can casting cause data loss?
    4. Is casting allowed between boolean and int?

 */



public class CastingTest {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a;
        System.out.println(b);  // -126
    }
}
