package revision2;

public class MaximumSumCircularSubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int maxSum = nums[0];
        int curMax = 0;

        int minSum = nums[0];
        int curMin = 0;

        for (int num : nums) {

            // Kadane max
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            // Kadane min
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);

            totalSum += num;
        }

        // edge case: all negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {

        int[] nums = {5, -3, 5};

        int result = maxSubarraySumCircular(nums);

        System.out.println("Maximum Circular Sum: " + result);
    }
}
