package revision_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArrays_II {

    static List<Integer> intersection(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count elements in arr1
        for (int num : arr1) {
            frequency.put(
                    num,
                    frequency.getOrDefault(num, 0) + 1
            );
        }

        // Process arr2
        for (int num : arr2) {

            int count = frequency.getOrDefault(num, 0);

            if (count > 0) {

                result.add(num);

                // Consume one occurrence
                frequency.put(num, count - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4};

        List<Integer> answer = intersection(arr1, arr2);

        System.out.println("Intersection = " + answer);
    }
}
