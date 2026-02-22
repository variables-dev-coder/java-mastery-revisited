package day25_Array_Frequency_Problems;

import java.util.HashMap;

public class FrequencyUsingHashMap {
    public static void main(String[] args) {

        int[] arr = {1000000, 2, 1000000, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
