package logic_Array.day17_Fixed_Sliding_Window;

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            // update max frequency
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowSize = right - left + 1;

            // if invalid window → shrink
            if (windowSize - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);

        System.out.println("Longest Length: " + result);
    }
}
