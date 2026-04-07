package logic_Array.revision_1_15_days;

import java.util.HashMap;

public class Day3_FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // print frequency
        for (int key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
