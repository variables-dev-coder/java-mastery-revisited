package revision_Arrays;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            int needed = target - current;

            if (map.containsKey(needed)) {

                System.out.println(
                        "Indexes: " +
                                map.get(needed) +
                                ", " +
                                i
                );

                System.out.println(
                        "Values: " +
                                needed +
                                " + " +
                                current +
                                " = " +
                                target
                );

                return;
            }

            map.put(current, i);
        }

        System.out.println("No pair found.");
    }
}
