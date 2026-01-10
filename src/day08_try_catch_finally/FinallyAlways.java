package day08_try_catch_finally;

public class FinallyAlways {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } finally {
            System.out.println("Finally executed");
        }
    }
}

// Finally executed