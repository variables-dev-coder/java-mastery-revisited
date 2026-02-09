package day21_Array_revision;

public class SumAverageExample {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
