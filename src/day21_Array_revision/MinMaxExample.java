package day21_Array_revision;

public class MinMaxExample {

    public static void main(String[] args) {

        int[] arr = {12, -5, 7, 19, 0};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
