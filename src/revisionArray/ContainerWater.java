package revisionArray;

import java.util.Arrays;

public class ContainerWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int currentArea = h * w;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println("=== Container With Most Water Example ===");
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);

        System.out.println("Heights: " + Arrays.toString(height));
        System.out.println("Maximum water area: " + result);

        System.out.println("\nVisual representation:");
        System.out.println("Index: 0 1 2 3 4 5 6 7 8");
        System.out.println("Value: 1 8 6 2 5 4 8 3 7");
        System.out.println("\nMax area between index 1 (height=8) and index 8 (height=7)");
        System.out.println("Width = 8 - 1 = 7, Height = min(8, 7) = 7");
        System.out.println("Area = 7 * 7 = 49");
        System.out.println();
    }
}
