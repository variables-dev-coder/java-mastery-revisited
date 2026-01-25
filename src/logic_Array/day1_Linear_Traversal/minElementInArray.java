package logic_Array.day1_Linear_Traversal;

/*

Problem Statement (Simple Words)

Problem:
Given an array of numbers, find the minimum number in it.

Example:
[10, 8, 9, 5, 7, 1, 2]

    Output: 1

Thinking Process (BEFORE code)
------------------------------
Let’s think like a human, not like a compiler.
    1. We need to look at every element
    2. Keep one variable that remembers the minimum value so far
    3. Compare each new element with the current minimum
    4. If current element is minimum → update min
    5. End of array → answer is stored in min

Key realization:
    Array = continuous memory → accessed using index → index moves using loop

Dry Run (Step-by-Step)
----------------------

Array:

index:  0  1  2  3  4   5  6
value: [10, 8, 9, 5, 7, 1, 2]

Step 1: Initialization

    min = arr[0] = 10

Step 2: Loop starts

| i | arr[i] | min | Action          |
| - | ------ | --- | --------------- |
| 1 | 8      | 10  | 8 < 10 → min = 8|
| 2 | 9      | 8   | 9 > 8 → ignore  |
| 3 | 5      | 8   | 5 < 8 → min = 5 |
| 4 | 7      | 5   | 7 > 5 → ignore  |
| 5 | 1      | 5   | 1 < 5 → ignore  |
| 6 | 2      | 1   | 2 > 1 → ignore  |

Final Answer:

    min = 1

Clean Runnable Java Code

 */

public class minElementInArray {

    public static void main(String[] args) {

        int[] arr = {10, 8, 9, 5, 7, 1, 2};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimun element: " + min);
    }
}

// Minimun element: 1

/*
Important Observations (VERY IMPORTANT)
---------------------------------------
-> Loop starts from i = 1
     -> Because index 0 already stored in min

-> Only one loop

-> Time Complexity: O(n)

-> Space Complexity: O(1)

=> This pattern is called:
       Linear Traversal Pattern


 */