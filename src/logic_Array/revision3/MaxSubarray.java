package logic_Array.revision3;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
