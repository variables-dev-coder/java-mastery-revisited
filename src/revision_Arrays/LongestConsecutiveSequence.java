package revision_Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements into HashSet
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Check every unique number
        for (int num : set) {

            // Start only if num is the beginning
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Keep finding next consecutive number
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(
                "Longest consecutive length = "
                        + longestConsecutive(arr)
        );
    }
}
