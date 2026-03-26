package logic_Array.revision3;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = -1;

        // Step 2: Find max frequency
        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                result = key;
            }
        }

        System.out.println("Element: " + result);
        System.out.println("Frequency: " + maxFreq);
    }
}
