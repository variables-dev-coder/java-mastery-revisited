package logic_Array.revisionPrefix_Suffix;

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
