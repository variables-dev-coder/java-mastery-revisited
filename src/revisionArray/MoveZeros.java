package revisionArray;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int n : arr) {
            if (n != 0) arr[index++] = n;
        }
        while (index < arr.length) arr[index++] = 0;

        System.out.println(Arrays.toString(arr));
    }
}

