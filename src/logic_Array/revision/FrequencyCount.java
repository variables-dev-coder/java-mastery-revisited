package logic_Array.revision;

import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print frequency
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
