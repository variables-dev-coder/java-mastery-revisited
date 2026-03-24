package logic_Array.revision2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK2 {

    public static int longestSubarray(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Case 1: sum itself equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: sum-k found earlier
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // Store only first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        System.out.println(longestSubarray(arr, k)); // Output: 4
    }
}
