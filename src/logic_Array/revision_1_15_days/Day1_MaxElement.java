package logic_Array.revision_1_15_days;

public class Day1_MaxElement {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}
