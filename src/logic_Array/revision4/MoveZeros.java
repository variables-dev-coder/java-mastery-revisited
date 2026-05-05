package logic_Array.revision4;

public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        // Print result
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
