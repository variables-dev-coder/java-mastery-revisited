package logic_Array.day14_LongestConsecutiveSequence;

/*
🔵 Example 3 (Important Interview Case)
nums = [9,1,4,7,3,2,6,8]
🧠 Set
{1,2,3,4,6,7,8,9}
🧠 Start points
1 → start ✅
6 → start ✅
🧠 Build sequences

From 1:

1 → 2 → 3 → 4 → length = 4

From 6:

6 → 7 → 8 → 9 → length = 4
✅ Answer
4
🧠 Pattern Reminder

Always:

if(!set.contains(num - 1))
    start sequence

Then:

while(set.contains(num + 1))
    grow sequence
 */

import java.util.HashSet;

public class LongestConsecutiveExample3 {

    public static void main(String[] args) {

        int[] nums = {9,1,4,7,3,2,6,8};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: add elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: find sequences
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

        System.out.println("Longest Sequence Length = " + maxLength);
    }
}

/*
✅ Output
Longest Sequence Length = 4
🧠 Why Answer = 4

Set becomes:

{1,2,3,4,6,7,8,9}

Two sequences:

1 → 2 → 3 → 4   (length = 4)
6 → 7 → 8 → 9   (length = 4)
 */