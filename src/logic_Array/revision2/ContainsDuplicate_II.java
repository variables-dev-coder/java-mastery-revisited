package logic_Array.revision2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_II {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                int prevIndex = map.get(nums[i]);

                if (i - prevIndex <= k) {
                    return true;
                }
            }

            map.put(nums[i], i); // update latest index
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate_II sol = new ContainsDuplicate_II();

        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(sol.containsNearbyDuplicate(nums, k)); // true
    }
}
