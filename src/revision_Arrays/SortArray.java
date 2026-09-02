package revision_Arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {50, 10, 40, 20, 30};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
