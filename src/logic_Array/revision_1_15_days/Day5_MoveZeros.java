package logic_Array.revision_1_15_days;

public class Day5_MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int j = 0; // position for next non-zero

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
