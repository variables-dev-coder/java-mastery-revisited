package logic_Array.revision_1_15_days;

import java.util.HashSet;

public class Problem2_LongestSubstring {

    public static void main(String[] args) {

        String s = "pwwkew";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Length = " + maxLength);
    }
}
