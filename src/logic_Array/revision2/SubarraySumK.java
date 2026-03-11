package logic_Array.revision2;

import java.util.*;

public class SubarraySumK {

    public static int subarraySum(int[] nums,int k){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int n : nums){

            sum += n;

            if(map.containsKey(sum - k))
                count += map.get(sum - k);

            map.put(sum,
                    map.getOrDefault(sum,0)+1);
        }

        return count;
    }

    public static void main(String[] args){

        int nums[] = {1,1,1};

        System.out.println(subarraySum(nums,2));
    }
}
