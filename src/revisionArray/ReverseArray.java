package revisionArray;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

