package revision_Arrays;

import java.util.HashMap;

public class LongestSubarray {

    static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            // Build prefix sum
            prefixSum += arr[i];

            // Prefix sum that we need
            int needed = prefixSum - k;

            // Have we seen it before?
            if (map.containsKey(needed)) {

                int previousIndex = map.get(needed);

                int length = i - previousIndex;

                maxLength = Math.max(maxLength, length);
            }

            // Store ONLY the first occurrence
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int answer = longestSubarray(arr, k);

        System.out.println("Longest length = " + answer);
    }
}
