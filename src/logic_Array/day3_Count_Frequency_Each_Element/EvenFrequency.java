package logic_Array.day3_Count_Frequency_Each_Element;

/*
Variation 1 — Count Frequency of Even Numbers
---------------------------------------------

Problem Statement (Simple Words)

Problem:
Given an array of integers, count how many times each even number appears.

Example:

Input:  [1, 2, 2, 3, 4, 4, 4, 5]
Output:
2 → 2
4 → 3

Odd numbers must be ignored completely.

Thinking Process (BEFORE Code)
------------------------------
Think like a human:
    1. We will visit each element one by one using a loop
    2. For every element:
        Check if it is even
        If it is odd, skip it

    3. If the element is even:
        If it is appearing first time, store it with count 1
        If it already exists, increase its count

    4. After the loop ends:
        Memory will contain frequency of each even number

Memory choice:
-------------
We use HashMap because we don’t know values in advance.

Dry Run (Step-by-Step)
----------------------
Array:

[1, 2, 2, 3, 4, 4, 4, 5]

Start with empty map
{}

Element 	Even?	    Action	                Map
1	        ❌	        skip	                 {}
2	        ✅	        first time → add	    {2=1}
2	        ✅	        exists → +1	            {2=2}
3	        ❌	        skip	                {2=2}
4	        ✅	        first time → add	    {2=2, 4=1}
4	        ✅	        exists → +1	            {2=2, 4=2}
4	        ✅	        exists → +1	            {2=2, 4=3}
5	        ❌	        skip	                {2=2, 4=3}

 */



import java.util.HashMap;

public class EvenFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            // Skip odd
            if (arr[i] % 2 != 0) {
                continue;
            }

            // Even count
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print Array
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}




/*
Important Observations
----------------------
Loop still linear traversal
continue helps skip unwanted elements
Time Complexity: O(n)
Space Complexity: O(n) (only even numbers stored)
Pattern used:
    Filter + Count

Mental Template (VERY IMPORTANT)
--------------------------------
for each element:
    if not needed → skip
    else → update memory

This template will appear again in:
    duplicates
    majority element
    backend log analysis
    string frequency


 */