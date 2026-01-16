package day10_throwVSthrows;

// Understand rethrowing

public class RethrowSame {

    static void process() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Logging...");
            throw e;
        }
    }

    public static void main(String[] args) {
       // process();

        try {
            process();
        } catch (ArithmeticException e) {
            System.out.println("try-catch added in main");
        }
    }
}

//Practice

//Add try-catch in main
//Observe preserved stack trace
