package logic_Array.revision;

public class ReverseArray3 {

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        reverse(arr);

        System.out.print("Reversed Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
