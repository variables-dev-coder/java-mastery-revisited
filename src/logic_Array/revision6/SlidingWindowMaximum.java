package logic_Array.revision6;

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new LinkedList<>();

        int[] result = new int[nums.length - k + 1];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove elements outside window
            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] < nums[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);

            // Window complete
            if (i >= k - 1) {

                result[index++] =
                        nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums =
                {1,3,-1,-3,5,3,6,7};

        int k = 3;

        System.out.println(
                Arrays.toString(
                        maxSlidingWindow(nums, k)
                )
        );
    }
}
