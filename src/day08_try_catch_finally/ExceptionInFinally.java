package day08_try_catch_finally;

public class ExceptionInFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } finally {
            int b = 10 / 0;
        }
    }
}

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at day08_try_catch_finally.ExceptionInFinally.main(ExceptionInFinally.java:8)