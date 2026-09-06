package revision_Arrays;

public class RotateArray {

    static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        // If k is larger than array length
        k = k % n;

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
