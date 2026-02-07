package logic_Array.day4_Second_LargestElement;

/*
Second Largest Element (One Pass)
---------------------------------

Why this problem matters
This teaches:

multi-variable tracking
careful condition ordering
real interview logic (very common)

🧠 Problem Statement (Simple Words)

Problem:
Given an array, find the second largest element.

📌 Example:

Input:  [10, 5, 20, 8, 15]
Output: 15

Thinking Process (BEFORE Code)
------------------------------
We need:
largest element
second largest element

But:
No sorting
Only one loop

Step-by-Step Thinking
----------------------

1. Keep two variables:
   largest
   secondLargest

2. Traverse array once
3. For each element:
   If current > largest
      → update secondLargest
      → update largest
   Else if current < largest AND current > secondLargest
      → update secondLargest

Order of checks is critical.

Dry Run (Step-by-Step)
----------------------

Array:

[10, 5, 20, 8, 15]

Initialization
largest = -∞
secondLargest = -∞

Traversal

| Element | largest | secondLargest | Action                |
| ------- | ------- | ------------- | --------------------- |
| 10      | 10      | -∞            | largest updated       |
| 5       | 10      | 5             | secondLargest updated |
| 20      | 20      | 10            | both updated          |
| 8       | 20      | 10            | ignore                |
| 15      | 20      | 15            | secondLargest updated |

 */


public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest : " + secondLargest);
    }
}

/*
Important Observations

One pass → O(n)
No sorting
Two variables tracked together
Condition order avoids mistakes

Mental Formula (MEMORIZE)
-------------------------
if current > largest:
    second = largest
    largest = current
else if current between largest & second:
    second = current

Edge Case Awareness (Interview Tip)
-----------------------------------
   Array size < 2 → no second largest
   All elements same → second largest doesn’t exist

(We’ll handle this cleanly in variations.)


 */