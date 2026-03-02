package revisionArray;

public class FindMaximum {

    public static void main(String[] args) {

        int[] arr = { 3, 11, 8, 0, 1, 5};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
