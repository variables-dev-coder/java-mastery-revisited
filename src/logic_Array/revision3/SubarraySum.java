package logic_Array.revision3;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static void main(String[] args) {

        int[] arr = {1,1,1};
        int k = 2;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0, count = 0;

        for(int num : arr){

            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        System.out.println(count); // 2
    }
}
