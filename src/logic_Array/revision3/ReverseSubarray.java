package logic_Array.revision3;

import java.util.Arrays;

public class ReverseSubarray {

    static void reverse(int[] arr, int L, int R) {

        int left = L;
        int right = R;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        reverse(arr, 1, 4);

        System.out.println(Arrays.toString(arr)); // [1,5,4,3,2,6]
    }
}
