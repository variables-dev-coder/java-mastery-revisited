package logic_Array.revision5;

public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            // If non-zero found
            if (nums[i] != 0) {

                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }

        // Print final array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
