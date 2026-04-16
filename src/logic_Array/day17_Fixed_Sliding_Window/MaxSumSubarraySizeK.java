package logic_Array.day17_Fixed_Sliding_Window;

public class MaxSumSubarraySizeK {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        // Step 1: first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: slide window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i];       // add next
            windowSum -= arr[i - k];   // remove left

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int result = maxSum(arr, k);

        System.out.println("Max Sum: " + result);
    }
}
