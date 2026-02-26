package revisionArray;

import java.util.*;

public class LargestRectangleHistogram {

    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int h = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {

                int height = heights[stack.pop()];

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights = {2,1,5,6,2,3};

        int result = largestRectangleArea(heights);

        System.out.println("Largest Area = " + result);
    }
}
