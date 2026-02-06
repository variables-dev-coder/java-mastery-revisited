package logic_Array.day3_Count_Frequency_Each_Element;

import java.util.HashMap;

public class FrequencyQueries {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};
        int x = 2;   // query element

        HashMap<Integer, Integer> map = new HashMap<>();

        // build frequency map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // frequency query
        System.out.println(map.getOrDefault(x, 0));

    }
}
