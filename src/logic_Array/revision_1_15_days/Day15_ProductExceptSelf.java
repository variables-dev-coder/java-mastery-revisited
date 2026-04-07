package logic_Array.revision_1_15_days;

public class Day15_ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] result = new int[n];

        // Step 1: prefix (left product)
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: suffix (right product)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        // print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
