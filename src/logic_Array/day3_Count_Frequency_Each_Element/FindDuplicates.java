package logic_Array.day3_Count_Frequency_Each_Element;

/*
Variation 3 — Detect Duplicate Elements
---------------------------------------
Why this matters
This is asked in almost every interview in some form:

“Print duplicates”

“Check if array has duplicates”

“Find repeating elements”

And guess what?
Same frequency map. No new logic.

Problem Statement (Simple Words)

Problem:
Given an array, find all elements that appear more than once.

Example:

Input:  [1, 2, 2, 3, 1, 4, 5]
Output:
1
2


Because:

1 appears 2 times

2 appears 2 times

Others appear only once

Thinking Process (BEFORE Code)
------------------------------
We already know the foundation.

Step 1: Build Frequency Map
--------------------------
1. Traverse array
2. Store count of each element in HashMap

Step 2: Identify Duplicates
---------------------------
1. Traverse HashMap
2. If frequency > 1
        That element is a duplicate
3. Print or collect it

Dry Run (Step-by-Step)
----------------------

Array:

[1, 2, 2, 3, 1, 4, 5]

Frequency Map:
1 → 2
2 → 2
3 → 1
4 → 1
5 → 1

Checking Map:

                Element	    Frequency	    Duplicate?
                    1	        2	            ✅ Yes
                    2	        2	            ✅ Yes
                    3	        1	            ❌ No
                    4	        1	            ❌ No
                    5	        1	            ❌ No

 */

import java.util.HashMap;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1 : Count Frequency
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2 : print duplicates
        System.out.println("Duplicates element: ");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}

// 1
// 2

/*
Important Observations
----------------------
Same counting logic
Different condition (> 1)
Time Complexity: O(n)
Space Complexity: O(n)
Pattern:
   Count → Filter

Mental Template (FINAL for Day 3)
---------------------------------
Build frequency map
For each entry:
    if condition matches → answer


This template solves:
    duplicates
    unique elements
    majority element
    frequency queries

 */