package day22_Reversal_Techniques;

public class ReverseSubArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        int start = 1;
        int end = 4;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print Array
        for(int num : arr) {
            System.out.print(num + " ");  // 10 50 40 30 20 60
        }
    }
}
