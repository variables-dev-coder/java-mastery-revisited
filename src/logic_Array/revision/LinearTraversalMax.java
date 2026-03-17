package logic_Array.revision;

public class LinearTraversalMax {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
