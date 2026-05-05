package logic_Array.revision4;

public class MaxProductSubarray {
    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            int tempMin = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));

            maxSoFar = tempMax;
            minSoFar = tempMin;

            result = Math.max(result, maxSoFar);
        }

        System.out.println("Maximum Product: " + result);
    }
}
