package revisionArray;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        int max = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
        }
        System.out.println(max);
    }
}

