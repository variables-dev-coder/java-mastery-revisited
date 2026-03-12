package logic_Array.day11_Variable_Window;

public class CountSubarrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int k = 5;

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        System.out.println("Total subarrays = " + count);
    }
}
