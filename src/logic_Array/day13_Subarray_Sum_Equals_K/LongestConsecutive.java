package logic_Array.day13_Subarray_Sum_Equals_K;

/*

🔴 DAY 14 — Longest Consecutive Sequence

Pattern: HashSet
Goal: Find sequence without sorting (O(n))

🧠 Problem Statement

Given an unsorted array:

nums = [100, 4, 200, 1, 3, 2]

Find the length of the longest consecutive sequence.

🧾 Example

Sequence:

[1,2,3,4]

Answer:

4
❌ Wrong Approach (Beginner Thinking)

Sort array:

[1,2,3,4,100,200]

Then find sequence.

Time:

O(n log n)
🧠 Expert Idea (O(n))

We use a HashSet to:

✔ Check existence in O(1)
✔ Build sequences without sorting

🧠 Core Insight (VERY IMPORTANT)

Only start counting when number is the beginning of a sequence

👉 A number is a start if:

num - 1 does NOT exist
🧠 Why This Works

Example:

nums = [1,2,3,4]

We only start from:

1 → because 0 is not present

We DO NOT start from:

2,3,4 → because previous exists

This avoids repeated work.

🧪 Step-by-Step Dry Run
nums = [100,4,200,1,3,2]

Put in set:

{100,4,200,1,3,2}
Check each number
num = 100
99 not present → start sequence

Sequence:

100 → length = 1
num = 4
3 present → NOT start
num = 200
199 not present → start

Sequence:

200 → length = 1
num = 1
0 not present → start

Build sequence:

1 → 2 → 3 → 4

Length:

4
✅ Final Answer
4
 */


import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int maxLength = 0;

        for(int num : set){

            // start of sequence
            if(!set.contains(num - 1)){

                int current = num;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println("Longest Sequence = " + maxLength);
    }
}

/*

🧠 Time Complexity
O(n)

Each number is visited once.

🧠 Key Interview Insight

“Only start counting when num-1 is not present”

This line is the heart of the problem.

🔥 Mental Model

Think like:

Find starting points → grow forward
 */