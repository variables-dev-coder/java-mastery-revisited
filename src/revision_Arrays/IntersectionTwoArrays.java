package revision_Arrays;

import java.util.HashSet;

public class IntersectionTwoArrays {

    static HashSet<Integer> intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store first array
        for (int num : arr1) {
            set.add(num);
        }

        // Check second array
        for (int num : arr2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        HashSet<Integer> answer = intersection(arr1, arr2);

        System.out.println("Intersection = " + answer);
    }
}
