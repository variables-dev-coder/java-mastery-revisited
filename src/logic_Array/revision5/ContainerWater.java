package logic_Array.revision5;

public class ContainerWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);

            int width = right - left;

            int area = h * width;

            maxWater = Math.max(maxWater, area);

            // Move smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum Water: " + maxWater);
    }
}
