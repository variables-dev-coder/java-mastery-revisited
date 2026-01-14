package day09_Multiple_catch_Multi_catch;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error handled");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error handled");
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer handled");
        }
    }
}

// Multiple Catch Blocks (Different Handling)

// Only one catch executes
//First matching catch wins