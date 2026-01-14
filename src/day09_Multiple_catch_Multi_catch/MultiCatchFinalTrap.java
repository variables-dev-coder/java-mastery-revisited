package day09_Multiple_catch_Multi_catch;

public class MultiCatchFinalTrap {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException | NullPointerException e) {
          //  e = new RuntimeException(); // ❌ compile-time error
        }
    }
}

// NOT COMPILE

//Compiler cannot allow reassignment
//Type safety guarantee