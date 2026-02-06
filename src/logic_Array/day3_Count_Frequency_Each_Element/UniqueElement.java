package logic_Array.day3_Count_Frequency_Each_Element;

import java.util.HashMap;

public class UniqueElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Unique element: ");
        for (int key : map.keySet()) {
            if (map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
