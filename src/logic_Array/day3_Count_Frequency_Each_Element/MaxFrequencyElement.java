package logic_Array.day3_Count_Frequency_Each_Element;

/*
Variation 2 — Find Element with Maximum Frequency
-------------------------------------------------
(Same structure as Variation 1)

Problem Statement (Simple Words)

Problem:
Given an array of numbers, find which number appears the most times.

Example:

Input:  [1, 2, 2, 3, 1, 2]
Output: 2

Because:
1 appears 2 times
2 appears 3 times
3 appears 1 time

So, 2 has the maximum frequency.

Thinking Process (BEFORE Code)
-------------------------------
We solve this in two very clear steps.

STEP 1: Count Frequency of Each Element
---------------------------------------
1. Visit each element one by one
2. Use HashMap to store:
     key → number
     value → count
3. If number appears first time → count = 1
4. If number already exists → increase count

After this step:
    We know how many times each element appears

STEP 2: Find Maximum Frequency Element
--------------------------------------
1. Keep two variables:
       maxFreq → stores highest frequency seen so far
       maxElement → stores element with that frequency
2. Traverse the HashMap:
    If current frequency > maxFreq
        update maxFreq
        update maxElement
3. End of map traversal → maxElement is the answer

Dry Run (Step-by-Step)
----------------------

Array:

[1, 2, 2, 3, 1, 2]

Step 1: Frequency Map Creation
------------------------------
        Element	            Count
            1	                2
            2	                3
            3	                1

Step 2: Find Maximum Frequency
------------------------------
Start:

maxFreq = 0
maxElement = 0

    Element	        Frequency	            maxFreq	        maxElement
        1	            2	                    2	            1
        2	            3	                    3	            2
        3	            1	                    3	            2

Final Answer:

Element with maximum frequency = 2

 */


import java.util.HashMap;

public class MaxFrequencyElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1 : count frequency

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Step 2 : Find element with max frequency

        int maxFreq = 0;
        int maxElement = arr[0];

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }


        System.out.println("Element with maximum frequency : " + maxElement);
    }
}

// Element with maximum frequency : 2


/*
Important Observations
---------------------
Two loops:
    One on array
    One on HashMap
Time Complexity: O(n)
Space Complexity: O(n)
Pattern used:
    Count → Compare

Mental Template (VERY IMPORTANT)
--------------------------------
1. Build frequency map
2. Traverse map
3. Track max value
4. Return corresponding key

This template repeats in:
    Most frequent character
    Majority element
    Log analysis
    Analytics dashboards

 */