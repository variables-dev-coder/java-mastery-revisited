package revisionArray;

import java.util.Arrays;

public class FindMinRotated {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If array is not rotated
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the minimum
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Decide which half to search
            if (nums[mid] >= nums[0]) {
                left = mid + 1; // Minimum is in right half
            } else {
                right = mid - 1; // Minimum is in left half
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println("=== Find Minimum in Rotated Array ===");

        int[][] testCases = {
                {4, 5, 6, 7, 0, 1, 2},
                {3, 4, 5, 1, 2},
                {11, 13, 15, 17},
                {2, 1},
                {1}
        };

        for (int[] nums : testCases) {
            int result = findMin(nums);
            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Minimum element: " + result);
            System.out.println("Rotation point: " + findIndex(nums, result));
            System.out.println();
        }
    }

    private static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}
