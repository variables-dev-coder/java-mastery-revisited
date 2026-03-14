package logic_Array.day12_Prefix_Sum;

import java.util.HashMap;

public class SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int k = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums){

            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }

        System.out.println("Subarrays with sum k = " + count);
    }
}
