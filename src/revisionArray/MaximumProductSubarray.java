package revisionArray;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int result = maxProduct(nums);

        System.out.println("Maximum Product Subarray = " + result);
    }

    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            int tempMax = max;

            max = Math.max(current,
                    Math.max(max * current, min * current));

            min = Math.min(current,
                    Math.min(tempMax * current, min * current));

            result = Math.max(result, max);
        }
        return result;
    }
}

