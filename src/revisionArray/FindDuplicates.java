package revisionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        // Restore original array (optional)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println("=== Find All Duplicates Example ===");
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] numsCopy = nums.clone();
        List<Integer> result = findDuplicates(numsCopy);

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Duplicates found: " + result);
        System.out.println("Array after processing: " + Arrays.toString(numsCopy) + " (unchanged)");

        System.out.println("\nHow it works:");
        System.out.println("1. Use the array itself as a hash map");
        System.out.println("2. For each number, mark its corresponding index as visited");
        System.out.println("3. If we find an index already marked, it's a duplicate");
        System.out.println();
    }
}
