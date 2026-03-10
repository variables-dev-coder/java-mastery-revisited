package logic_Array.day10_Fixed_Window_Sum;

/*
Fixed Window Sum (Sliding Window)

Problem: Maximum sum of subarray of size K

Pattern: Sliding Window (Fixed Size)
Goal: Maintain window discipline

Problem Statement

Given an array and an integer K,
find the maximum sum of any subarray of size K.

Example:

arr = [2,1,5,1,3,2]
k = 3

Possible subarrays of size 3:

[2,1,5] → 8
[1,5,1] → 7
[5,1,3] → 9
[1,3,2] → 6

Answer:

9

Subarray:

[5,1,3]
Brute Force Thinking

Check every window:

sum(arr[i] → arr[i+k-1])

Time Complexity:

O(n*k)

Slow.

Sliding Window Idea

Instead of recalculating every window:

We reuse previous window sum.

Example:

First window:

[2,1,5] → sum = 8

Next window:

remove 2
add 1

New sum:

8 - 2 + 1 = 7

That is the key trick.

Sliding Window Formula
windowSum = windowSum - arr[i-k] + arr[i]

Where:

i = new element entering window
i-k = element leaving window

Dry Run
arr = [2,1,5,1,3,2]
k = 3
First window
[2,1,5]
sum = 8
maxSum = 8
Slide window

Remove 2, add 1

8 - 2 + 1 = 7
maxSum = 8

Window:

[1,5,1]
Slide again

Remove 1, add 3

7 - 1 + 3 = 9
maxSum = 9

Window:

[5,1,3]
Slide again

Remove 5, add 2

9 - 5 + 2 = 6
maxSum = 9

Final answer:

9
 */


public class MaxSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Max Sum = " + maxSum);
    }
}

/*
Key Insight

Sliding window saves time because we reuse previous work.

Instead of computing:

k additions for every window

We do only:

1 subtraction
1 addition

Time Complexity:

O(n)
Mental Model

Think of window like this:

[ i-k+1  ...  i ]

When window moves:

left element leaves
right element enters

 */