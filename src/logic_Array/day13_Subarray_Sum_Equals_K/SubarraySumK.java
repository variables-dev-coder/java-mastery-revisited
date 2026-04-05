package logic_Array.day13_Subarray_Sum_Equals_K;

/*
PHASE 4 — DAY 13

Subarray Sum Equals K (Expert Level)

Pattern: Prefix Sum + HashMap
Core Skill: Remember past → solve present

Problem (Reframe Like Expert)

You are NOT solving:

“Find subarray sum = k”

You are solving:

“At index j, how many previous prefixes can form sum = k?”

This shift is everything.

Core Equation (Heart of Problem)

We know:

subarray sum (i → j) = k

Using prefix:

prefix[j] - prefix[i-1] = k

Rearrange:

prefix[i-1] = prefix[j] - k
Meaning (Simple Language)

At current index j:

If we have seen (prefixSum - k) before
Then a valid subarray exists

Why HashMap?

We need to quickly answer:

Have I seen this prefix before?
How many times?

So we store:

prefixSum → frequency
Expert Insight (Very Important)

We are NOT storing elements.

We are storing:

“sum up to this point”

This is why it works.

Deep Dry Run
nums = [1,1,1]
k = 2

Start:

map = {0:1}
prefixSum = 0
count = 0
Step 1 → 1
prefixSum = 1

Check:

1 - 2 = -1 → not found

Store:

map = {0:1, 1:1}
Step 2 → 1
prefixSum = 2

Check:

2 - 2 = 0 → FOUND
count = 1

Store:

map = {0:1,1:1,2:1}
Step 3 → 1
prefixSum = 3

Check:

3 - 2 = 1 → FOUND
count = 2
Final Answer
2

Subarrays:

[1,1] (index 0–1)
[1,1] (index 1–2)
The Real Trick (EXPERT LEVEL)

This problem is about:

Turning subarray problem → prefix difference problem

You convert:

Find sum inside array

Into:

Find two prefix sums with difference k
Why map.put(0,1)?

This handles:

prefixSum == k

Example:

[2,1]
k = 3

At index 1:

prefixSum = 3

We need:

3 - 3 = 0

So 0 must exist → hence {0:1}

Common Mistakes (Interview Killers)

Forgetting map.put(0,1)
Using only set instead of frequency
Updating map before checking
Not handling negative numbers

 */


import java.util.HashMap;

public class SubarraySumK {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}

/*
Time & Space
Time: O(n)
Space: O(n)
When to Use This Pattern

Use Prefix + HashMap when:

Subarray sum problems
Negative numbers present
“Count subarrays” question
Need O(n) solution

Ultimate Mental Shortcut

Whenever you see:

subarray sum = k

Immediately think:

prefixSum - k exists?
Final Mastery Test

 */