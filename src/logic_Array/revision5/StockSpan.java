package logic_Array.revision5;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        int[] prices =
                {100,80,60,70,60,75,85};

        int n = prices.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove smaller/equal prices
            while (!stack.isEmpty()
                    && prices[stack.peek()]
                    <= prices[i]) {

                stack.pop();
            }

            // Calculate span
            if (stack.isEmpty()) {

                span[i] = i + 1;
            } else {

                span[i] = i - stack.peek();
            }

            // Push current index
            stack.push(i);
        }

        // Print result
        for (int num : span) {

            System.out.print(num + " ");
        }
    }
}
