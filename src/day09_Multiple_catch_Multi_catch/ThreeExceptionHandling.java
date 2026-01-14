package day09_Multiple_catch_Multi_catch;

public class ThreeExceptionHandling {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();               // NullPointerException
            int a = 10 / 0;           // ArithmeticException
            int[] arr = new int[2];
            System.out.println(arr[3]); // AIOOBE
        }
        catch (NullPointerException e) {
            System.out.println("Null issue");
        }
        catch (ArithmeticException e) {
            System.out.println("Math issue");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array issue");
        }
    }
}

// Null issue