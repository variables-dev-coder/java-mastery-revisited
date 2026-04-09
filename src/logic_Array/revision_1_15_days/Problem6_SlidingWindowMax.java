package logic_Array.revision_1_15_days;

import java.util.*;

public class Problem6_SlidingWindowMax {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        Deque<Integer> dq = new ArrayDeque<>();

        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // remove out-of-window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // store result
            if (i >= k - 1) {
                result[index++] = nums[dq.peekFirst()];
            }
        }

        // print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
