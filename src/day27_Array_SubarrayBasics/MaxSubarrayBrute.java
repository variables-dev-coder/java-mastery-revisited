package day27_Array_SubarrayBasics;

public class MaxSubarrayBrute {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                int sum = 0;

                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
