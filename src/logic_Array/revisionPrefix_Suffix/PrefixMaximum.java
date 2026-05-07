package logic_Array.revisionPrefix_Suffix;

public class PrefixMaximum {

    public static void main(String[] args) {

        int[] nums = {3,1,4,2,5};

        int[] result = new int[nums.length];

        int maxSoFar = nums[0];

        for (int i = 0; i < nums.length; i++) {

            maxSoFar = Math.max(maxSoFar, nums[i]);

            result[i] = maxSoFar;
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
