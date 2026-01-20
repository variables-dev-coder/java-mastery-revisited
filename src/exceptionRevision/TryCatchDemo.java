package exceptionRevision;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero handled");
        }
        System.out.println("Program continues");
    }
}

//Prevents crash
//Handles specific exception