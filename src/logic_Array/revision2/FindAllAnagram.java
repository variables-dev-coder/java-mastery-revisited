package logic_Array.revision2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        // frequency of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            // add current char
            window[s.charAt(i) - 'a']++;

            // remove left char when window exceeds size
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }

            // compare arrays
            if (Arrays.equals(pCount, window)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        FindAllAnagram fd = new FindAllAnagram();

        System.out.println(fd.findAnagrams("cbaebabacd", "abc")); // [0, 6]
    }
}
