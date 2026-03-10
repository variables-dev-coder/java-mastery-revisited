package logic_Array.day10_Fixed_Window_Sum;

public class CountSubarrays {

    public static void main(String[] args) {

        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;

        int windowSum = 0;
        int count = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (windowSum >= threshold * k) {
            count++;
        }

        // slide window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i-k] + arr[i];

            if (windowSum >= threshold * k) {
                count++;
            }
        }

        System.out.println("Valid Subarrays = " + count);
    }
}
