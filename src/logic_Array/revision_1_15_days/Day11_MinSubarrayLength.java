package logic_Array.revision_1_15_days;

public class Day11_MinSubarrayLength {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // shrink window
            while (sum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println("Minimum Length = " + minLength);
    }
}
