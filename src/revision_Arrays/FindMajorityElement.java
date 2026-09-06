package revision_Arrays;

import java.util.HashMap;

public class FindMajorityElement {

    static int majorityElement(int[] arr) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int required = arr.length / 2;

        for (int num : arr) {

            frequency.put(
                    num,
                    frequency.getOrDefault(num, 0) + 1
            );

            if (frequency.get(num) > required) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(
                "Majority element = " + majorityElement(arr)
        );
    }
}
