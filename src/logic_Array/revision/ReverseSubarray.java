package logic_Array.revision;

public class ReverseSubarray {

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        int L = 1;
        int R = 3;

        reverse(arr, L, R);

        System.out.print("After reversing subarray: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
