package logic_Array.day18_Hybrid_Sliding_Window;

import java.util.*;

public class FruitsIntoBaskets {

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // if more than 2 types → shrink
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,1,2,3};
        System.out.println("Max Fruits: " + totalFruit(fruits));
    }
}
