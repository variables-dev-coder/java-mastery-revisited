package logic_Array.day11_Variable_Window;

public class LongestSubarraySumK {

    public static void main(String[] args) {

        int[] arr = {4,2,1,7,8,1,2,8};
        int k = 8;

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest length = " + maxLength);
    }
}
