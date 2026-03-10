package logic_Array.day10_Fixed_Window_Sum;

public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum = windowSum - nums[i - k] + nums[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        double maxAverage = (double) maxSum / k;

        System.out.println("Maximum Average = " + maxAverage);
    }
}
