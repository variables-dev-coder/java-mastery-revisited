package exceptionRevision;

public class WrapExceptionDemo {
    static void process() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Calculation failed", e);
        }
    }
    public static void main(String[] args) {
        process();
    }
}

