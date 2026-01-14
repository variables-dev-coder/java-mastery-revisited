package day09_Multiple_catch_Multi_catch;

public class BadMultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException | NullPointerException e) {
            // ❌ wrong: logic differs
            System.out.println("Error occurred");
        }
    }
}

// BAD DESIGN

// Arithmetic ≠ Null issue

//Recovery logic differs