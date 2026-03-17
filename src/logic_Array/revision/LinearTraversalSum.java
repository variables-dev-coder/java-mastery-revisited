package logic_Array.revision;

public class LinearTraversalSum {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
