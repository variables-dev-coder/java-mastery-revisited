package logic_Array.revision6;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int pivot = -1;

        // Step 1: Find pivot
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: Find next greater element
        if (pivot != -1) {

            for (int i = nums.length - 1; i > pivot; i--) {

                if (nums[i] > nums[pivot]) {

                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;

                    break;
                }
            }
        }

        // Step 3: Reverse suffix
        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        nextPermutation(nums);

        System.out.println(
                Arrays.toString(nums)
        );
    }
}
