package logic_Array.revision5;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Decide: start new OR continue old
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}
