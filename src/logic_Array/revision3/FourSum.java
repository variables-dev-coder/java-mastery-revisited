package logic_Array.revision3;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {

                int left = j + 1, right = nums.length - 1;

                while (left < right) {

                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++; right--;
                    }
                    else if (sum < target) left++;
                    else right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        System.out.println(fourSum(arr, 0));
    }
}
