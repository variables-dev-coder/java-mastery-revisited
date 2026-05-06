package logic_Array.revision5;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove duplicates
            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));

                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Length: " + maxLength);
    }
}
