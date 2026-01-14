package day09_Multiple_catch_Multi_catch;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]);
        }
        catch (NullPointerException |
               ArithmeticException |
               ArrayIndexOutOfBoundsException e) {

            System.out.println("Runtime exception occurred");
        }
    }
}

// Runtime exception occurred

//Behind the scenes
//JVM checks type
//Executes shared block
//e is implicitly final