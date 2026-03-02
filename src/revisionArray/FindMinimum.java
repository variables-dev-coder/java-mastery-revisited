package revisionArray;

public class FindMinimum {

    public static void main(String[] args) {

        int[] arr = {10, 8, 9, 5, 7, 1, 2};

        int min = arr[0];  // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
