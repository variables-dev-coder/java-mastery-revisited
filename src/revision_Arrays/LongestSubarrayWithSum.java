package revision_Arrays;

public class LongestSubarrayWithSum {

    static int longestSubarray(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            // Expand window
            sum += arr[right];

            // Shrink window if invalid
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // Current window is valid
            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int answer = longestSubarray(arr, k);

        System.out.println("Longest length = " + answer);
    }
}
