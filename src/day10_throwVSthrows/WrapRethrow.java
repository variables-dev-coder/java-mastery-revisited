package day10_throwVSthrows;

// Convert low-level → high-level exception

public class WrapRethrow {

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

//Practice

//Print e.getCause()
//Observe root cause preserved