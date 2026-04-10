package revision2;

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;

        int[] result = new int[n - k + 1];
        int ri = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove out-of-window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Add result
            if (i >= k - 1) {
                result[ri++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
