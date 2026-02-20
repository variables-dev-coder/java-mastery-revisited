package logic_Array.day7_Array_PairSum_SortedArray;

/*
PHASE 2 — DAY 7
Pair Sum (Sorted Array)

Pattern: Two pointers (opposite direction)
Why: Decision-based movement

Problem Statement (Simple Words)

Given a sorted array and a target sum,
find if there exists a pair whose sum equals the target.

Example:

Array:  [1, 2, 3, 4, 6, 8]
Target: 10
Output: true (because 2 + 8 = 10)
Why Sorted Matters

Because sorted array allows us to:

Start one pointer at beginning

Start one pointer at end

Make smart decisions

Without sorting → this trick doesn't work.

Big Idea

We use:

left = 0

right = n - 1

And we keep adjusting them based on sum.

Decision Logic (Very Important)
sum = arr[left] + arr[right]

If sum == target → found
If sum < target → increase left
If sum > target → decrease right
Why This Works

If sum is too small:
→ we need bigger number
→ move left forward

If sum is too large:
→ we need smaller number
→ move right backward

Because array is sorted, this is guaranteed safe.

Dry Run

Array:

[1, 2, 3, 4, 6, 8]
Target = 10

Start:

left = 0 (1)
right = 5 (8)
Step 1
1 + 8 = 9
9 < 10
→ move left

left = 1

Step 2
2 + 8 = 10
Match found

Stop.

Mental Formula (MEMORIZE)

Too small → move left
Too big → move right
Equal → done

This is classic interview pointer logic.

Why This Is Powerful

Time Complexity:

O(n)

Better than brute force:

O(n²)

 */

public class PairSumSorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 10;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + " and " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No Pair Found");
    }
}
