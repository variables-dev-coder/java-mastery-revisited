package day21_Array_revision;

public class TraversalExample {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // Forward traversal
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Reverse traversal
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
