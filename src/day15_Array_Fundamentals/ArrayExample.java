package day15_Array_Fundamentals;

public class ArrayExample {

    public static void main(String[] args) {

        // Declare and initialize array of 5 integers
        int[] arr = {10, 20, 30, 40, 50};

        // Print all values
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Change one value
        arr[2] = 99;

        // Print again after modification
        System.out.println("\nAfter Changing One Value:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Original Array:
//10 20 30 40 50
//After Changing One Value:
//10 20 99 40 50 