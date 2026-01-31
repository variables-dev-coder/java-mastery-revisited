package day18_Basic_Array_Problems;

public class SmallestElement {

    public static void main(String[] args) {

        int[] arr = {15, 7, 22, 9, 3};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}

// Smallest = 3