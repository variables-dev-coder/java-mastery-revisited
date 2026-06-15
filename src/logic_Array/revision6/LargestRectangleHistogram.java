package logic_Array.revision6;

import java.util.Stack;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight =
                    (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                    currentHeight < heights[stack.peek()]) {

                int height =
                        heights[stack.pop()];

                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea =
                        Math.max(maxArea,
                                height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights =
                {2,1,5,6,2,3};

        System.out.println(
                largestRectangleArea(heights)
        );
    }
}
