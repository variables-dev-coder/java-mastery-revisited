package logic_Array.revision_1_15_days;

import java.util.HashMap;

public class Problem1_SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {3,4,7,2,-3,1,4,2};
        int k = 7;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Total Subarrays = " + count);
    }
}
