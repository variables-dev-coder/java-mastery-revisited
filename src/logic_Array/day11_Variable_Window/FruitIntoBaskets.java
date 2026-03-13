package logic_Array.day11_Variable_Window;

import java.util.HashMap;

public class FruitIntoBaskets {

    public static void main(String[] args) {

        int[] fruits = {1, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0)
                    map.remove(fruits[left]);

                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        System.out.println("Maximum Fruits = " + maxFruits);
    }
}
