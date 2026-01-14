package day09_Multiple_catch_Multi_catch;

public class HybridCatchPattern {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        }
        catch (NullPointerException | ArithmeticException e) {
            System.out.println("Runtime bug logged");
        }
        catch (Exception e) {
            System.out.println("Generic fallback handling");
        }
    }
}


//Why this is clean

//Similar bugs grouped
//Generic fallback last
//Readable & scalable

