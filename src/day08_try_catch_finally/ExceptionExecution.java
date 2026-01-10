package day08_try_catch_finally;

public class ExceptionExecution {
    public static void main(String[] args) {
        try {
            System.out.println("Try start");
            int a = 10 / 0;
            System.out.println("Try end");
        } catch (ArithmeticException e) {
            System.out.println("Catch executed");
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("Program continues");
    }
}

//Try start
//Catch executed
//Finally executed
//Program continues

//try → exception → catch → finally → continue