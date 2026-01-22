package revisionArray;

import java.util.Arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currentMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println("=== Maximum Subarray Example ===");
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum subarray sum: " + result);
        System.out.println("Maximum subarray is [4, -1, 2, 1] = 6");
        System.out.println();
    }
}
