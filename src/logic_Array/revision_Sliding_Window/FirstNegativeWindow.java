package logic_Array.revision_Sliding_Window;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeWindow {

    public static void main(String[] args) {

        int[] nums = {12,-1,-7,8,-15,30,16,28};

        int k = 3;

        Queue<Integer> queue = new LinkedList<>();

        // Process first window
        for (int i = 0; i < k; i++) {

            if (nums[i] < 0) {

                queue.add(i);
            }
        }

        // Process remaining windows
        for (int i = k; i <= nums.length; i++) {

            // Print first negative
            if (!queue.isEmpty()) {

                System.out.print(nums[queue.peek()] + " ");
            } else {

                System.out.print("0 ");
            }

            // Remove expired indices
            while (!queue.isEmpty()
                    && queue.peek() <= i - k) {

                queue.poll();
            }

            // Add new negative element
            if (i < nums.length
                    && nums[i] < 0) {

                queue.add(i);
            }
        }
    }
}
