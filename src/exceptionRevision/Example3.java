package exceptionRevision;

public class Example3 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }
}

