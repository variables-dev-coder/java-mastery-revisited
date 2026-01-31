package day18_Basic_Array_Problems;

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum off all element = " + sum);
    }
}

//Sum off all element = 150