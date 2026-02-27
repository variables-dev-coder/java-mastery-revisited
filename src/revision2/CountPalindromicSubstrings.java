package revision2;

import java.util.*;

public class CountPalindromicSubstrings {

    public static int countPalindromes(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindromes
            count += expand(s, i, i);

            // Even length palindromes
            count += expand(s, i, i + 1);
        }

        return count;
    }

    private static int expand(String s, int left, int right) {

        int count = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            if (right - left + 1 >= 2) {
                count++;
            }

            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPalindromes("abaab"));   // 3
        System.out.println(countPalindromes("aaa"));     // 3
        System.out.println(countPalindromes("abbaeae")); // 4
    }
}
