package logic_Array.day18_Hybrid_Sliding_Window;

/*
🧩 Example 2 — Longest Substring with K Distinct Characters

👉 Longest Substring with At Most K Distinct Characters

🧠 Problem

Given string + k
👉 Find longest substring with at most k distinct characters

Input:
s = "eceba"
k = 2
🧠 Step 1: Thinking

👉 Track distinct characters → use Map

🚀 Step 2: Algorithm
Expand window
Add char to map
If map size > k:
shrink window
Update max length
🔁 Dry Run
e → {e} → len=1
ec → {e,c} → len=2
ece → {e,c} → len=3 ✅
eceb → {e,c,b} ❌ (3 > k)

shrink:
remove e → still 3
remove c → {e,b} → valid

continue...
✅ Answer:
3 ("ece")

⚡ Complexity
⏱ Time → O(n)
🧠 Space → O(k)

 */

import java.util.HashMap;
import java.util.Map;

public class KDistinct {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;

        System.out.println(lengthOfLongestSubstringKDistinct(s, k));
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

