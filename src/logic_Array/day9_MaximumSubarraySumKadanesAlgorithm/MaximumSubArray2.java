package logic_Array.day9_MaximumSubarraySumKadanesAlgorithm;

public class MaximumSubArray2 {

    public static void main(String[] args) {

        int[] arr = {5, -2, 3, 4};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Sub Array: " + maxSum);
    }
}
