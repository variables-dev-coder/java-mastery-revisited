package revision2;

import java.util.*;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // 1️⃣ Odd length palindrome
            int len1 = expand(s, i, i);

            // 2️⃣ Even length palindrome
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("forgeeksskeegfor"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("abc"));
    }
}
