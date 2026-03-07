package day27_Array_SubarrayBasics;

import java.util.HashMap;

public class EqualZeroOne {

    public static void main(String[] args) {

        int[] arr = {0,1,0,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        map.put(0,-1);

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 0)
                prefixSum += -1;
            else
                prefixSum += 1;

            if(map.containsKey(prefixSum)){

                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);

            } else {

                map.put(prefixSum, i);
            }
        }

        System.out.println(maxLen);
    }
}
