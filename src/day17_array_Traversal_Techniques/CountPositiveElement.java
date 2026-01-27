package day17_array_Traversal_Techniques;

public class CountPositiveElement {
    public static void main(String[] args) {

        int[] arr = {11, 23, -12, -46, 44, 67};

        int positive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            }
        }
        System.out.println(positive);
    }
}
