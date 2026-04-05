package logic_Array.day13_Subarray_Sum_Equals_K;

/*
🔴 DAY 15 — Product of Array Except Self

Pattern: Prefix + Suffix
Goal: Build answer without division

🧠 Problem Statement

Given:

nums = [1,2,3,4]

Output:

[24,12,8,6]
🧠 Meaning

For each index:

answer[i] = product of all elements except nums[i]

Example:

Index	Calculation	Result
0	2×3×4	24
1	1×3×4	12
2	1×2×4	8
3	1×2×3	6
❌ Wrong Approach

Using division:

totalProduct / nums[i]

Problems:

Zero handling ❌
Not allowed in interviews ❌
🧠 Expert Idea

Break into two parts:

Left product  ×  Right product
🧠 Prefix & Suffix Meaning

For index i:

answer[i] =
(product of elements before i)
×
(product of elements after i)
🧪 Step-by-Step
nums = [1,2,3,4]
Step 1 — Prefix
prefix = [1,1,2,6]

Meaning:

i	prefix[i]
0	1
1	1
2	1×2 = 2
3	1×2×3 = 6
Step 2 — Suffix
suffix = [24,12,4,1]
Step 3 — Multiply
answer[i] = prefix[i] × suffix[i]

Result:

[24,12,8,6]
🧠 Space Optimization (Expert Level)

We don’t need two arrays.

We can do:

Build prefix in result array
Traverse from right and multiply suffix
 */

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int n = nums.length;

        int[] result = new int[n];

        // Step 1: prefix
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        // Step 2: suffix (from right)
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        // print
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}

/*
Output:

24 12 8 6
🧠 Why This Works

At index i:

result[i] = product of left side
suffix = product of right side

So:

result[i] = left × right
🧠 Complexity
Time: O(n)
Space: O(1) (excluding output)
🧠 Key Insight

This problem teaches:

Split problem into independent parts (left + right)

🔥 Real Interview Thinking

Whenever you see:

“except self”

Think:

left contribution + right contribution
 */