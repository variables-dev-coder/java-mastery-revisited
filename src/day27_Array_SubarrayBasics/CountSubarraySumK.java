package day27_Array_SubarrayBasics;

public class CountSubarraySumK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int k = 3;

        int count = 0;

        for (int start = 0; start < arr.length; start++) {

            int sum = 0;

            for (int end = start; end < arr.length; end++) {

                sum += arr[end];

                if (sum == k)
                    count++;
            }
        }

        System.out.println("Total subarrays = " + count);
    }
}
