package logic_Array.day5_Pointer_Logic;

/*
Move Zeros to End
-----------------
Why this problem?
It teaches:
    Conditional pointer movement
    In-place modification
    Order preservation
    Smart swapping
    This is a core interview pointer problem.

Problem Statement (Simple Words)
--------------------------------
Given an array, move all 0s to the end
while keeping the relative order of non-zero elements.

Example:

Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]

Thinking Process (Before Code)
------------------------------
We need:
 Non-zero elements at front
 Zeros at back
 No extra array
 Preserve order

Key Idea

Use two pointers:
------------------
i → scans array (fast pointer)
j → marks position to place next non-zero (slow pointer)

Pointer Movement Logic
-----------------------

j = 0

for i from 0 to n-1:
    if arr[i] != 0:
        swap arr[i] with arr[j]
        j++

Dry Run (Very Important)
------------------------
Array:
[0, 1, 0, 3, 12]

Start:

| i | arr[i] | Action    | Array        | j |
| - | ------ | --------- | ------------ | - |
| 0 | 0      | skip      | [0,1,0,3,12] | 0 |
| 1 | 1      | swap(1,0) | [1,0,0,3,12] | 1 |
| 2 | 0      | skip      | [1,0,0,3,12] | 1 |
| 3 | 3      | swap(3,1) | [1,3,0,0,12] | 2 |
| 4 | 12     | swap(4,2) | [1,3,12,0,0] | 3 |

Final:

[1, 3, 12, 0, 0]

 */


public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*

Important Observations
----------------------
One traversal → O(n)
In-place → O(1)
Order preserved
Only swap when needed

Mental Formula (Very Important)
-------------------------------
Fast pointer scans.
Slow pointer builds valid zone.

This same pattern is used in:
-----------------------------
Remove duplicates
Partition array
Dutch national flag
Stable partitioning

 */