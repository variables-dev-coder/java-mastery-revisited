package logic_Array.day3_Count_Frequency_Each_Element;

/*
ARRAY LOGIC BUILDING — DAY 3
----------------------------
Count Frequency of Each Element
-------------------------------

Why Day 3 matters
-----------------
Today you learn how memory works with traversal.

This is the base of:
    duplicates
    majority element
    anagrams
    frequency-based logic (very common in interviews & backend)

Problem Statement (Simple Words)
--------------------------------

Problem:
Given an array, count how many times each element appears.

Example:

Input:  [1, 2, 2, 3, 1, 2]
Output:
1 → 2
2 → 3
3 → 1

Thinking Process (BEFORE code)
------------------------------

Think in plain English:
    1. We will visit each element one by one
    2. We need a place to remember counts
    3. If element appears first time → count = 1
    4. If element already seen → increase count
    5. End of array → memory contains frequency

Question:
    Where do we store memory?

Answer:
    HashMap (flexible, real-world)
    Array (when range is small)

Today we start with HashMap.

Dry Run (Step-by-Step)
----------------------

Array:

[1, 2, 2, 3, 1, 2]


Memory (Map):

Element	 |   Count
1	          1
2	          1

After second 2:

2 → 2

After 3:

3 → 1

After second 1:

1 → 2

After third 2:

2 → 3

Final Map:

1 → 2
2 → 3
3 → 1

 */

import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 3, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // print Array

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

//1 -> 2
//2 -> 3
//3 -> 2


/*
Important Observations
----------------------
    One traversal → O(n)
    Extra memory → O(n)
    HashMap gives O(1) average lookup
    This is counting + memory pattern


Small Variations (DO NOT CODE YET)

Variation 1:

Count frequency only for even numbers

Variation 2:

Find element with maximum frequency

Variation 3:

Detect duplicate elements

 */