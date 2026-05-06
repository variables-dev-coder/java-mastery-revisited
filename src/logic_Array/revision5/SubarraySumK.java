package logic_Array.revision5;

import java.util.HashMap;

public class SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            // Check if subarray exists
            if (map.containsKey(currentSum - k)) {

                count += map.get(currentSum - k);
            }

            // Store prefix sum
            map.put(currentSum,
                    map.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println("Total Subarrays: " + count);
    }
}
