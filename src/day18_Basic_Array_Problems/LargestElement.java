package day18_Basic_Array_Problems;

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {15, 7, 22, 9, 3};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
    }
}

// Largest = 22