package revisionArray;

import java.util.HashMap;

public class EvenFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            // skip odd number
            if (arr[i] % 2 != 0) {
                continue;
            }
            
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
