package revision_Arrays;

import java.util.HashMap;

public class FirstNonRepeatingElement {

    static int firstNonRepeating(int[] arr) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Pass 1: Count frequencies
        for (int num : arr) {

            frequency.put(
                    num,
                    frequency.getOrDefault(num, 0) + 1
            );
        }

        // Pass 2: Preserve original order
        for (int num : arr) {

            if (frequency.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        int answer = firstNonRepeating(arr);

        System.out.println("First non-repeating element = " + answer);
    }
}
