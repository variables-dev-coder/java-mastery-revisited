package logic_Array.revision3;

import java.util.Arrays;

public class ReverseArrayRecursion {

    static void reverse(int[] arr, int left, int right) {

        // base condition
        if (left >= right) return;

        // swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // recursive call
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr)); // [5,4,3,2,1]
    }
}
