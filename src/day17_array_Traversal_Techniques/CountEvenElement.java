package day17_array_Traversal_Techniques;

public class CountEvenElement {
    public static void main(String[] args) {

        int[] arr = {10, 11, 33, 42, 57};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
