package logic_Array.revision2;

import java.util.*;

public class MaxDistinctSubarraySum {

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            // Shrink window if size > k
            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                sum -= nums[left];
                left++;
            }

            // Check distinct condition
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        long result = maximumSubarraySum(nums, k);
        System.out.println("Maximum distinct subarray sum: " + result);
    }
}
