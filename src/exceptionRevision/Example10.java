package exceptionRevision;

public class Example10 {
    public static void main(String[] args) {
        try {
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught inside");
                throw e;
            }
        } catch (Exception e) {
            System.out.println("Caught again");
        }
    }
}

