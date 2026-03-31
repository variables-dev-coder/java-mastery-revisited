package logic_Array.revision3;

import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) left++;
                else right--;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;

        System.out.println(threeSumClosest(arr, target));
    }
}
