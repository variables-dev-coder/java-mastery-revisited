package revision2;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k))
                count += map.get(sum - k);

            map.put(sum, map.getOrDefault(sum,0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums,2)); // 2
    }
}
