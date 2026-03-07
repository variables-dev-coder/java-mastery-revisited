package day27_Array_SubarrayBasics;

public class MaxCircularSubarray {

    public static void main(String[] args) {

        int[] arr = {5, -3, 5};

        int totalSum = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        int currentMax = 0;
        int currentMin = 0;

        for(int num : arr) {

            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }

        int circularSum = totalSum - minSum;

        if(maxSum < 0)
            System.out.println(maxSum);
        else
            System.out.println(Math.max(maxSum, circularSum));
    }
}
