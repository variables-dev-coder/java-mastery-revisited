package logic_Array.revision5;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures =
                {73,74,75,71,69,72,76,73};

        int n = temperatures.length;

        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller temperatures
            while (!stack.isEmpty()
                    && temperatures[stack.peek()]
                    <= temperatures[i]) {

                stack.pop();
            }

            // Calculate days
            if (stack.isEmpty()) {

                result[i] = 0;
            } else {

                result[i] = stack.peek() - i;
            }

            // Push current index
            stack.push(i);
        }

        // Print result
        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}
