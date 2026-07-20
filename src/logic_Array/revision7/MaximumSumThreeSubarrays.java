package logic_Array.revision7;

import java.util.Arrays;

public class MaximumSumThreeSubarrays {

    public static int[] maxSumOfThreeSubarrays(int[] nums, int k) {

        int n = nums.length;

        int[] window = new int[n - k + 1];

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (i >= k)
                sum -= nums[i - k];

            if (i >= k - 1)
                window[i - k + 1] = sum;
        }

        int[] left = new int[window.length];

        int best = 0;

        for (int i = 0; i < window.length; i++) {

            if (window[i] > window[best])
                best = i;

            left[i] = best;
        }

        int[] right = new int[window.length];

        best = window.length - 1;

        for (int i = window.length - 1; i >= 0; i--) {

            if (window[i] >= window[best])
                best = i;

            right[i] = best;
        }

        int[] ans = new int[3];

        int max = 0;

        for (int mid = k; mid < window.length - k; mid++) {

            int l = left[mid - k];

            int r = right[mid + k];

            int total = window[l] + window[mid] + window[r];

            if (total > max) {

                max = total;

                ans[0] = l;
                ans[1] = mid;
                ans[2] = r;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,1,2,6,7,5,1};

        System.out.println(Arrays.toString(
                maxSumOfThreeSubarrays(nums,2)
        ));
    }
}
