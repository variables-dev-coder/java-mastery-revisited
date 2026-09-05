package revision_Arrays;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};

        int target = 33;

        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {

            // Expand window
            sum += arr[right];

            // Shrink window if sum is too large
            while (sum > target && left <= right) {

                sum -= arr[left];
                left++;
            }

            // Found target
            if (sum == target) {

                System.out.println(
                        "Subarray found from index " +
                                left + " to " + right
                );

                System.out.println(
                        "Start = " + arr[left]
                );

                System.out.println(
                        "End = " + arr[right]
                );

                return;
            }
        }

        System.out.println("No subarray found.");
    }
}
