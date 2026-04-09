package logic_Array.revision_1_15_days;

import java.util.HashSet;

public class Problem5_LongestConsecutive {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            // start of sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println("Longest Sequence = " + maxLength);
    }
}
