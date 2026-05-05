package logic_Array.revision4;

public class MaxWater {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Max Water: " + maxArea);
    }
}
