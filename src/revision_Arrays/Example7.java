package revision_Arrays;

import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] arr2 = {9, 3, 0, 1, 5, 77};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));  // [0, 1, 3, 5, 9, 77]

        System.out.println(arr); // [I@65ab7765

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50]

        // System.out.println(Arrays.deepToString(matrix)); -> for 2D arrays


    }
}

/*
Useful Arrays class
-------------------

Java provides:
-------------
java.util.Arrays

Some useful methods:
--------------------

Arrays.toString(arr)
Arrays.deepToString(matrix)
Arrays.sort(arr)
Arrays.copyOf(arr, newLength)
Arrays.fill(arr, value)
Arrays.equals(a, b)
Arrays.binarySearch(arr, key)

 */