package day25_Array_Frequency_Problems;

import java.util.HashMap;

public class CountOccurrencesMap {
    public static void main(String[] args) {

        int[] arr = {5,7,5,2,7,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of 5: " + map.get(5));
    }
}
