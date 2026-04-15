package logic_Array.day18_Hybrid_Sliding_Window;

/*
🧩 Example 1 — Minimum Size Subarray Sum

👉 Minimum Size Subarray Sum

🧠 Problem

Given:

array
target sum

👉 Find smallest subarray length whose sum ≥ target

Input:
arr = [2,3,1,2,4,3]
target = 7
🧠 Step 1: Thinking

👉 Not fixed size ❌
👉 Not just unique ❌

👉 We need:

sum condition
smallest length

👉 This is Hybrid

🚀 Step 2: Algorithm Thinking
Expand (right++)
Add to sum
If sum ≥ target:
update answer
shrink (left++)
🔁 Dry Run
[2] → sum=2
[2,3] → 5
[2,3,1] → 6
[2,3,1,2] → 8 ✅

Now shrink:
remove 2 → [3,1,2] → sum=6 ❌

--------------------------------
continue

[3,1,2,4] → 10 ✅
remove 3 → [1,2,4] → 7 ✅
remove 1 → [2,4] → 6 ❌

--------------------------------
[2,4,3] → 9 ✅
→ shrink → [4,3] → 7 ✅ (length = 2 BEST)
✅ Answer:
2
 */


public class MinSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

/*
⚡ Complexity
⏱ Time → O(n)
🧠 Space → O(1)
🧠 Learning

👉 Condition-based shrinking
👉 Not fixed size
👉 Not just duplicates
 */