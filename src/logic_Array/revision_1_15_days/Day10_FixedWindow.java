package logic_Array.revision_1_15_days;

public class Day10_FixedWindow {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // slide window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max Sum = " + maxSum);
    }
}
