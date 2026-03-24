package logic_Array.revision2;

import java.util.Arrays;

public class PermutationString {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] window = new int[26];

        // count s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            // add current char
            window[s2.charAt(i) - 'a']++;

            // remove left char
            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            // compare
            if (Arrays.equals(s1Count, window)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        PermutationString ps = new PermutationString();

        System.out.println(ps.checkInclusion("ab", "eidbaooo")); // true
    }
}
