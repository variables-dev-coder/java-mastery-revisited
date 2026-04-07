package logic_Array.revision_1_15_days;

public class Day2_ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
