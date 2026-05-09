package logic_Array.revision5;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums = {4,5,2,10};

        int n = nums.length;

        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty()
                    && stack.peek() <= nums[i]) {

                stack.pop();
            }

            // Next greater element
            if (stack.isEmpty()) {

                result[i] = -1;
            } else {

                result[i] = stack.peek();
            }

            // Push current element
            stack.push(nums[i]);
        }

        // Print result
        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}
