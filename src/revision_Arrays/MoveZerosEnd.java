package revision_Arrays;

import java.util.Arrays;

public class MoveZerosEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;

                position++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
