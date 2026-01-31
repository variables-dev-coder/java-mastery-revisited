package day18_Basic_Array_Problems;

public class MinMaxArray {

    public static void main(String[] args) {

        int[] arr = {12, 23, 25, -3, 11, 7, 9, 1};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum element = " + min);
        System.out.println("maximum element = " + max);
    }
}

//Minimum element = -3
//maximum element = 25