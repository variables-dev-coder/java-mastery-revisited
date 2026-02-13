package day22_Reversal_Techniques;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // print array
        for (int num : arr) {
            System.out.print(num + " "); // 50 40 30 20 10
        }
    }
}
