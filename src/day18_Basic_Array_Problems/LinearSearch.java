package day18_Basic_Array_Problems;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 12, 34, 23, 11};
        int key = 12;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element found" : "Element not found");
    }
}

// Element found