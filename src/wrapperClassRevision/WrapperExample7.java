package wrapperClassRevision;

import java.util.HashMap;

public class WrapperExample7 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {

            if (frequency.containsKey(number)) {

                int count = frequency.get(number);

                frequency.put(number, count + 1);

            } else {

                frequency.put(number, 1);
            }
        }

        System.out.println(frequency);
    }
}
