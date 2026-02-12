package day21_Array_revision;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 3, 2, 5};

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];

                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];

                right--;
            }
        }

        System.out.println("Water trapped = " + water);
    }
}
