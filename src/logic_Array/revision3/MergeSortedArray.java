package logic_Array.revision3;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // merge both arrays
        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // remaining elements
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(result));
    }
}
