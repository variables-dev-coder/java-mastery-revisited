package logic_Array.day9_MaximumSubarraySumKadanesAlgorithm;

/*
Maximum Subarray Sum (Kadane’s Algorithm)

Pattern: Running Sum + State Reset
Why: Smart memory while traversing

Problem Statement (Simple Words)

Given an array (can contain negative numbers),
find the maximum sum of any contiguous subarray.

Example:

Input:  [-2,1,-3,4,-1,2,1,-5,4]
Output: 6

Because subarray:

[4,-1,2,1] = 6
First Understand the Real Question

We are NOT finding:

Maximum element

Maximum total sum

We are finding:

The best continuous chunk.

This is important.

Brute Force Thinking (Why It’s Bad)

You could:

Start at every index

Try all possible subarrays

Track max sum

Time Complexity:

O(n²)

Too slow.

We want:

O(n)
The Big Insight (Core Idea)

When moving left to right:

If your current running sum becomes negative…

It is useless to continue carrying it.

Because:

Adding a negative sum to future elements
will only reduce future total.

So we reset.

This is the genius of Kadane.

Mental Model (Very Important)

We keep two variables:

currentSum → running subarray sum

maxSum → best sum found so far

Algorithm in Simple Words

For each element:

Add element to currentSum

Update maxSum

If currentSum becomes negative
→ reset it to 0

Dry Run (Step-by-Step)

Array:

[-2,1,-3,4,-1,2,1,-5,4]

Start:

currentSum = 0
maxSum = -∞
Step 1: -2
currentSum = -2
maxSum = -2
currentSum < 0 → reset to 0
Step 2: 1
currentSum = 1
maxSum = 1
Step 3: -3
currentSum = -2
maxSum = 1
reset to 0
Step 4: 4
currentSum = 4
maxSum = 4
Step 5: -1
currentSum = 3
maxSum = 4
Step 6: 2
currentSum = 5
maxSum = 5
Step 7: 1
currentSum = 6
maxSum = 6
Step 8: -5
currentSum = 1
maxSum = 6
Step 9: 4
currentSum = 5
maxSum = 6

Final:

maxSum = 6

 */

public class MaximumSubArray {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Sub Array: " + maxSum);
    }
}

/*
Why Reset Works (Expert Explanation)

Suppose:

currentSum = -5

Next number is:

+10

If we continue:

-5 + 10 = 5

But if we reset:

10 alone is better than 5

So carrying negative baggage is harmful.

That is the core logic.

Expert-Level Insight

Kadane is not magic.

It is based on:

If prefix sum becomes negative, discard it.

This is dynamic programming in disguise.

At each index, we decide:

Should I extend previous subarray?
OR
Should I start fresh?

That’s state decision logic.

Edge Case (Important)

If all numbers are negative:

[-3,-2,-5]

Answer should be:

-2

Our initialization with Integer.MIN_VALUE handles that.

One-Line Master Formula
currentSum = max(num, currentSum + num)
maxSum = max(maxSum, currentSum)

That’s compact Kadane.

 */