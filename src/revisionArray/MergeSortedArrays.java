package revisionArray;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last element of nums1 actual data
        int j = n - 1; // Last element of nums2
        int k = m + n - 1; // Last position of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 if any
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Merge Sorted Arrays Example ===");

        // nums1 has extra space for nums2 elements
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        System.out.print("Array 1 (with space): ");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2: " + Arrays.toString(nums2));

        merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));

        System.out.println("\nVisual merging:");
        System.out.println("Step 1: [1, 3, 5, 0, 0, 0] + [2, 4, 6]");
        System.out.println("Step 2: Compare from end: 5 > 6? No, so put 6 at end");
        System.out.println("Step 3: [1, 3, 5, 0, 0, 6]");
        System.out.println("Continues until fully merged...");
        System.out.println();
    }
}
