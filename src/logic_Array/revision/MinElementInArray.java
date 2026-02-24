package logic_Array.revision;

public class MinElementInArray {

    public static void main(String[] args) {

        int[] arr = {4, 6, 8, 9, 0, 1, 2};
        int min = arr[0];

        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element : " + min);
    }
}
