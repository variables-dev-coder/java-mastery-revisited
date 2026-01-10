package day08_try_catch_finally;

/*
4. Catch Execution Order (Child → Parent)
Wrong Order (Compile-time Error)
try {
    int a = 10 / 0;
} catch (Exception e) {
} catch (ArithmeticException e) {
}

Correct Order
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Arithmetic");
} catch (Exception e) {
    System.out.println("General");
}


Rule

Most specific exception first

 */

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null issue");
        } catch (ArithmeticException e) {
            System.out.println("Math issue");
        }
    }
}

// Null issue

