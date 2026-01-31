package day18_Basic_Array_Problems;

public class AverageOfArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Average = " + average);
    }
}

// Average = 30.0