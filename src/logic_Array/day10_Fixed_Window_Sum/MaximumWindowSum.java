package logic_Array.day10_Fixed_Window_Sum;

public class MaximumWindowSum {

    public static void main(String[] args) {

        int[] arr = {4,2,1,7,8,1,2,8};
        int  k = 3;

        int windowSum = 0;


        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
