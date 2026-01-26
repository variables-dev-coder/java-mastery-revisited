package logic_Array.day2_Reverse_an_Array_IN_PLACE;

/*
PHASE 1: ARRAY BASICS
----------------------
Day 2 — Reverse an Array (IN-PLACE)
-----------------------------------

Why this day is important
--------------------------
This is your first real pointer logic problem.
Once this clicks, two pointers / sliding window / partition logic become easy later.

Problem Statement (Simple Words)
--------------------------------
Problem:
Given an array, reverse it without using extra array.

Example:

Input:  [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]


Condition:
    Modify the same array
    No extra array allowed

Thinking Process (BEFORE code)
-----------------------------
Let’s think slowly.
    1.We need to swap first and last
    2.Then move inward
    3.Keep doing swaps until pointers meet

So we use:
----------
One pointer from start
One pointer from end

This is called:
---------------
    Two Pointer Pattern

Dry Run (Step-by-Step)
----------------------

Array:

index:  0  1  2  3  4
value: [1, 2, 3, 4, 5]

Step 1: Initialization
----------------------
    left = 0
    right = 4

Step 2: Swap & Move
-------------------
Iteration 1
-----------
swap arr[0] and arr[4]
Array: [5, 2, 3, 4, 1]
left++
right--

Iteration 2
-----------
swap arr[1] and arr[3]
Array: [5, 4, 3, 2, 1]
left++
right--

Stop Condition
left >= right → STOP

 */


public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // print reverse array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // 10 9 8 7 6 5 4 3 2 1
        }
    }
}

/*

Important Observations (DO NOT IGNORE)
--------------------------------------
    left < right → avoids double swap
    Only one loop
    No extra array → in-place
    Time: O(n)
    Space: O(1)

This same logic is used in:
---------------------------
    String reversal
    Palindrome check
    Array rotation (later)

Small Variations (Practice)
--------------------------
Variation 1 (Must Do):
----------------------

Reverse array from index 1 to 3


Example:

Input:  [1, 2, 3, 4, 5]
Range:  1 to 3
Output: [1, 4, 3, 2, 5]

Variation 2 (Think Only):
-------------------------

Reverse array using for loop instead of while

Day 2 Rule Check
-----------------
    Problem statement
    Thinking before code
    Dry run
    Runnable code
    Two-pointer logic introduced


 */