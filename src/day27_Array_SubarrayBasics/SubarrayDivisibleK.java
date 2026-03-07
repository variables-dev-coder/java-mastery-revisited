package day27_Array_SubarrayBasics;

import java.util.HashMap;

public class SubarrayDivisibleK {

    public static void main(String[] args) {

        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int num : arr){

            prefixSum += num;

            int mod = prefixSum % k;

            if(mod < 0)
                mod += k;

            if(map.containsKey(mod))
                count += map.get(mod);

            map.put(mod, map.getOrDefault(mod,0) + 1);
        }

        System.out.println(count);
    }
}
