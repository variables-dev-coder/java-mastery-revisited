package logic_Array.revision_Sliding_Window;

public class MaxSumSubarrayK {

    public static void main(String[] args) {

        int[] nums = {2,1,5,1,3,2};

        int k = 3;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {

            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide window
        for (int right = k; right < nums.length; right++) {

            windowSum =
                    windowSum
                            - nums[right - k]
                            + nums[right];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}
