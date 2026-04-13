package logic_Array.day17_Fixed_Sliding_Window;

public class MaxAverage {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(findMaxAverage(arr, k));
    }

    public static double findMaxAverage(int[] arr, int k) {
        int windowSum = 0;
        double maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)];
            }
        }

        return maxSum / k;
    }
}
