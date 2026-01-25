package logic_Array.day1_Linear_Traversal;

/*

Problem Statement (Simple Words)

Problem:
Given an array of numbers, find the largest number in it.

Example:
[3, 7, 2, 9, 5]
Output: 9

Thinking Process (BEFORE code)
------------------------------
Let’s think like a human, not like a compiler.
    1. We need to look at every element
    2. Keep one variable that remembers the biggest value so far
    3. Compare each new element with the current maximum
    4. If current element is bigger → update max
    5. End of array → answer is stored in max

Key realization:
    Array = continuous memory → accessed using index → index moves using loop

Dry Run (Step-by-Step)
----------------------

Array:

index:  0  1  2  3  4
value: [3, 7, 2, 9, 5]

Step 1: Initialization

    max = arr[0] = 3

Step 2: Loop starts

| i | arr[i] | max | Action          |
| - | ------ | --- | --------------- |
| 1 | 7      | 3   | 7 > 3 → max = 7 |
| 2 | 2      | 7   | 2 < 7 → ignore  |
| 3 | 9      | 7   | 9 > 7 → max = 9 |
| 4 | 5      | 9   | 5 < 9 → ignore  |

Final Answer:

    max = 9

Clean Runnable Java Code

 */

public class MaxElementInArray {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};

        int max = arr[0]; // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}

// Maximum element: 9

/*
Important Observations (VERY IMPORTANT)
---------------------------------------
-> Loop starts from i = 1
     -> Because index 0 already stored in max

-> Only one loop

-> Time Complexity: O(n)

-> Space Complexity: O(1)

=> This pattern is called:
       Linear Traversal Pattern

You’ll use this in 100+ problems later.

 */