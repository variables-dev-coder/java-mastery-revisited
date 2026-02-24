package logic_Array.revision;

public class MaxElementInArray {

    public static void main(String[] args) {

        int[] arr = {4, 6, 8, 9, 0, 1, 2};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element : " + max);
    }
}
