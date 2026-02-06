package logic_Array.day3_Count_Frequency_Each_Element;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int n = arr.length;
        
        System.out.println("Majority Element: ");
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                System.out.println(key);
            }
        }
     }
}
