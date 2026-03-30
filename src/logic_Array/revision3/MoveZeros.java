package logic_Array.revision3;

public class MoveZeros {
    public static void moveZeroes(int[] arr) {

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);

        for (int num : arr) System.out.print(num + " ");
    }
}
