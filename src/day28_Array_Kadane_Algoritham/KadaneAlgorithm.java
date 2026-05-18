package day28_Array_Kadane_Algoritham;

/*

Kadane’s Algorithm
------------------

This is:
    Asked in almost every DSA interview
    Foundation for dynamic programming thinking
    A huge optimization jump

It converts:
    O(n²) brute force

into:
    O(n)

Let’s learn it deeply and clearly.

Array Day 14 – Kadane’s Algorithm
---------------------------------
Topics:
    1️⃣ Maximum Subarray Sum
    2️⃣ Core Kadane Logic
    3️⃣ Negative Numbers Handling
    4️⃣ Edge Cases
    5️⃣ Why Kadane Works

1️⃣ Problem Statement
--------------------
Given an array:

[-2,1,-3,4,-1,2,1,-5,4]

Find the contiguous subarray with maximum sum.

Answer:

[4,-1,2,1]
Sum = 6

2️⃣ Brute Force Thinking
------------------------

Earlier we did:

for(start)
   for(end)
      calculate sum

Complexity:

O(n²)

Too slow.

3️⃣ Kadane’s Main Idea
----------------------
🧠 Most Important Thought

At every index:

Should I:

1. continue previous subarray?
OR
2. start fresh from current element?

This is the heart of Kadane.

4️⃣ Core Logic
-------------

Suppose:

currentSum < 0

Then:

❌ Carrying it forward hurts future sum.

So we:

Discard it
Start new subarray

5️⃣ Visualization (Very Important)

Array:

[-2,1,-3,4,-1,2,1,-5,4]
Step-by-step
Start
currentSum = -2
maxSum = -2
Next: 1

Question:

1
OR
-2 + 1 = -1

Better:

1

So:

currentSum = 1

Update:

maxSum = 1
Next: -3
-3
OR
1 + (-3) = -2

Better:

-2

currentSum = -2

Next: 4
4
OR
-2 + 4 = 2

Better:

4

Start fresh.

Continue...

Eventually:

[4,-1,2,1]

becomes:

6

Maximum.

6️⃣ Kadane Formula (Most Important)
----------------------------------

currentSum = Math.max(arr[i], currentSum + arr[i]);

maxSum = Math.max(maxSum, currentSum);

This single line is the entire algorithm.

8️⃣ Time & Space Complexity
---------------------------

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |


9️⃣ Why Kadane Is Dynamic Programming
-------------------------------------

Kadane stores:

Best answer ending at current index

Then uses it for next index.

This is DP thinking:

Reuse previous computation.

🔟 Edge Case – All Negative Numbers
-----------------------------------

Very important interview trap.

Example:

[-5,-2,-8,-1]

Correct answer:

-1

NOT:

0

❌ Wrong Beginner Mistake
--------------------------

Many beginners do:

if(currentSum < 0)
    currentSum = 0;

This fails for all-negative arrays.

1️⃣1️⃣ Correct Handling of Negative Numbers
------------------------------------------

That’s why we initialize:

currentSum = arr[0];
maxSum = arr[0];

NOT:

0

1️⃣2️⃣ Important Interview Questions
-----------------------------------
❓ Why discard negative currentSum?

Because adding a negative value reduces future sums.

❓ Why O(n)?

Because each element is processed once.

❓ Can Kadane work for all-negative arrays?

Yes, if initialized correctly.

❓ What does currentSum represent?

Maximum subarray sum ending at current index.

1️⃣3️⃣ Visual Mental Model
-------------------------

Think like:

Should I carry previous baggage?
OR
start fresh?

Kadane continuously makes this decision.

1️⃣4️⃣ Common Variations
-----------------------

Kadane is base for:
    Maximum circular subarray
    Maximum product subarray
    2D Kadane (matrix)
    Stock buy/sell problems
    Dynamic programming optimizations

🧠 Expert Summary
------------------

Kadane works because:
    Negative running sums are harmful
    Local best contributes to global best
    Each position decides:
    continue OR restart

This is:

Greedy + Dynamic Programming thinking.


 */


public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum sum = " + maxSum);
    }
}
