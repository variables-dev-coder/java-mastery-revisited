package logic_Array.revision;

public class MoveZeros2 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 0, 12, 4, 0, 11, 2};

        int j = 0;  // position for next non-zero

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
