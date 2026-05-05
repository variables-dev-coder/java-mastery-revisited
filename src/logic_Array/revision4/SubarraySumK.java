package logic_Array.revision4;

import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println("Total Subarrays: " + count);
    }
}
