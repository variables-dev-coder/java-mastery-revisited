package day08_try_catch_finally;

public class FinallyWithoutCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } finally {
            System.out.println("Finally executed");
        }
    }
}

//Finally executed
//Exception in thread "main" java.lang.ArithmeticException