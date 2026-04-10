package revision2;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // add all elements
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // start only if previous not exists
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Sequence Length: " + result);
    }
}
