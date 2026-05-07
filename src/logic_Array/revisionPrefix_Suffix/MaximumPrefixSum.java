package logic_Array.revisionPrefix_Suffix;

public class MaximumPrefixSum {

    public static void main(String[] args) {

        int[] nums = {2,-1,3,-2,4};

        int prefixSum = 0;

        int maxPrefix = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            maxPrefix = Math.max(maxPrefix, prefixSum);
        }

        System.out.println("Maximum Prefix Sum: " + maxPrefix);
    }
}
