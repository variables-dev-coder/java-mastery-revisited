package revision_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // =========================
        // 1D ARRAY
        // =========================

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("1D Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    "Index " + i + " = " + arr[i]
            );
        }


        // =========================
        // 2D ARRAY
        // =========================

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n2D Array:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


        // =========================
        // DYNAMIC ARRAY
        // =========================

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("\nArrayList:");
        System.out.println(list);

        list.add(40);

        System.out.println("After adding 40:");
        System.out.println(list);

        list.set(1, 200);

        System.out.println("After updating index 1:");
        System.out.println(list);

        list.remove(0);

        System.out.println("After removing index 0:");
        System.out.println(list);


        // =========================
        // ARRAYS UTILITY
        // =========================

        Arrays.sort(arr);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
