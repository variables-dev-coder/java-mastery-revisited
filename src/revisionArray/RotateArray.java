package revisionArray;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k larger than array size

        // Reverse entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Rotate Array Example ===");
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] original = nums.clone();

        rotate(nums, k);

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Rotate by " + k + " steps to the right");
        System.out.println("Rotated array: " + Arrays.toString(nums));

        System.out.println("\nStep-by-step rotation:");
        int[] temp = original.clone();
        for (int i = 0; i < k; i++) {
            int last = temp[temp.length - 1];
            // Shift elements to right
            for (int j = temp.length - 1; j > 0; j--) {
                temp[j] = temp[j - 1];
            }
            temp[0] = last;
            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(temp));
        }
        System.out.println();
    }
}
