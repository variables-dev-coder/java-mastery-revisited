package day08_try_catch_finally;

public class FinallyWithException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } finally {
            System.out.println("Finally executed");
        }
    }
}

//Finally executed
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at day08_try_catch_finally.FinallyWithException.main(FinallyWithException.java:6)