package day09_Multiple_catch_Multi_catch;

public class CorrectOrder {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic handled");
        }
        catch (Exception e) {
            System.out.println("General handled");
        }
    }
}

// Always catch child exceptions before parent.