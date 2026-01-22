package revisionArray;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Three Sum Example ===");
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sorted: " + Arrays.toString(nums.clone()));
        System.out.println("Triplets that sum to zero:");

        for (int i = 0; i < result.size(); i++) {
            List<Integer> triplet = result.get(i);
            int sum = triplet.get(0) + triplet.get(1) + triplet.get(2);
            System.out.printf("  %d. %s = %d\n", i + 1, triplet, sum);
        }

        System.out.println("\nStep-by-step:");
        System.out.println("1. Sort the array: [-4, -1, -1, 0, 1, 2]");
        System.out.println("2. Fix first element and use two pointers for rest");
        System.out.println("3. Skip duplicates to avoid repeating triplets");
        System.out.println();
    }
}
