package logic_Array.revision_1_15_days;

public class Problem4_ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] result = new int[n];

        // prefix (left)
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // suffix (right)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        // print
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
