package day27_Array_SubarrayBasics;

public class MinSubarraySum {
    public static void main(String[] args) {

        int[] arr = {3,-4,2,-3,-1,7,-5};

        int minSum = Integer.MAX_VALUE;

        for(int start = 0; start < arr.length; start++) {

            int sum = 0;

            for(int end = start; end < arr.length; end++) {

                sum += arr[end];

                minSum = Math.min(minSum, sum);
            }
        }

        System.out.println(minSum);
    }
}
