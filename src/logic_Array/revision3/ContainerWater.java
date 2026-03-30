package logic_Array.revision3;

public class ContainerWater {
    public static int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;

            max = Math.max(max, h * width);

            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }
}
