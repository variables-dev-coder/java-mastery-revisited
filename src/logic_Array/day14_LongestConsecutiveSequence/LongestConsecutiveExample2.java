package logic_Array.day14_LongestConsecutiveSequence;

/*
🟡 Example 2
nums = [1,2,0,1]
🧠 Set
{1,2,0}
🧠 Start points
0 → start (no -1) ✅
1 → skip (0 exists)
2 → skip (1 exists)
🧠 Build
0 → 1 → 2 → length = 3
✅ Answer
3
 */

import java.util.HashSet;

public class LongestConsecutiveExample2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 0, 1};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: store elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: find sequences
        for (int num : set) {

            // start point check
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

        System.out.println("Longest Sequence Length = " + maxLength);
    }
}

/*
✅ Output
Longest Sequence Length = 3
🧠 Important Insight

Input has duplicates:

[1,2,0,1]

But HashSet removes duplicates automatically:

{0,1,2}

So sequence becomes:

0 → 1 → 2
 */