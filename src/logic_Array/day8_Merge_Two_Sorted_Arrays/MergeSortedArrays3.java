package logic_Array.day8_Merge_Two_Sorted_Arrays;

public class MergeSortedArrays3 {
    public static void main(String[] args) {

        int[] arr1 = {2, 6};
        int[] arr2 = {1, 3, 5};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        for(int num : merged) {
            System.out.print(num + " "); // 1 2 3 5 6
        }
    }
}
