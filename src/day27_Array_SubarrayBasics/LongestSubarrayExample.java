package day27_Array_SubarrayBasics;

public class LongestSubarrayExample {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 2, 4};
        int limit = 7;

        int maxLen = 0;

        for (int start = 0; start < arr.length; start++) {

            int sum = 0;

            for (int end = start; end < arr.length; end++) {

                sum += arr[end];

                if (sum <= limit) {

                    int len = end - start + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        System.out.println("Longest length = " + maxLen);
    }
}
