package logic_Array.revision3;

import java.util.Arrays;

public class ReverseArray {

    static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        System.out.println(Arrays.toString(arr)); // [5,4,3,2,1]
    }
}
