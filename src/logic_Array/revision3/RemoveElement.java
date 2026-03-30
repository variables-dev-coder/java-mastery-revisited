package logic_Array.revision3;

public class RemoveElement {
    public static int removeElement(int[] arr, int val) {

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != val) {
                arr[left++] = arr[right];
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;

        int len = removeElement(arr, val);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
