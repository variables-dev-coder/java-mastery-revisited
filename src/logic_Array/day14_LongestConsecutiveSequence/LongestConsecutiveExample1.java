package logic_Array.day14_LongestConsecutiveSequence;

/*
🟢 Example 1
nums = [10, 5, 12, 3, 55, 4, 11]
🧠 Step 1 — Put into set
{10,5,12,3,55,4,11}
🧠 Step 2 — Find starting points

Start only when:

num - 1 NOT present

Check:

3 → start (2 not present) ✅
4 → skip (3 exists)
5 → skip (4 exists)
10 → start (9 not present) ✅
11 → skip
12 → skip
55 → start (54 not present) ✅
🧠 Step 3 — Build sequences

From 3:

3 → 4 → 5 → length = 3

From 10:

10 → 11 → 12 → length = 3

From 55:

55 → length = 1
✅ Answer
3
 */

import java.util.HashSet;

public class LongestConsecutiveExample1 {

    public static void main(String[] args) {

        int[] nums = {10, 5, 12, 3, 55, 4, 11};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: check each number
        for (int num : set) {

            // start of sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // grow sequence
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println("Longest Sequence Length = " + maxLength);
    }
}
