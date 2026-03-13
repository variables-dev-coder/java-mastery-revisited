package logic_Array.day11_Variable_Window;

public class MinimumSubarraySum2 {

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];   // expand window

            while (sum >= target) {  // shrink window

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            System.out.println("No valid subarray");
        else
            System.out.println("Minimum length = " + minLength);
    }
}
