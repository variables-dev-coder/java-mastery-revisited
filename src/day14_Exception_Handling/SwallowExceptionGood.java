package day14_Exception_Handling;

public class SwallowExceptionGood {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Calculation failed: " + e.getMessage());
            throw e; // fail fast
        }
    }
}

