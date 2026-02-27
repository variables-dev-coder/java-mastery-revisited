package revision2;

import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] freq = new int[26];

        // Count characters of p
        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {

            // If char needed
            if (freq[s.charAt(right) - 'a'] > 0) {
                count--;
            }

            freq[s.charAt(right) - 'a']--;
            right++;

            // If window size equals p length
            if (count == 0) {
                result.add(left);
            }

            // Shrink window
            if (right - left == p.length()) {

                if (freq[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }

                freq[s.charAt(left) - 'a']++;
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}
