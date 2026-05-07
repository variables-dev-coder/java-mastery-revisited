package logic_Array.revisionPrefix_Suffix;

public class LeftRightDifference {

    public static void main(String[] args) {

        int[] nums = {10,4,8,3};

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            result[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
