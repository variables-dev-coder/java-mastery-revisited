package logic_Array.revision_Sliding_Window;

import java.util.Arrays;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency for s1
        for (int i = 0; i < s1.length(); i++) {

            freq1[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        // First window
        for (int i = 0; i < windowSize; i++) {

            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(freq1, freq2)) {

            System.out.println(true);

            return;
        }

        // Slide window
        for (int right = windowSize;
             right < s2.length();
             right++) {

            // Add new character
            freq2[s2.charAt(right) - 'a']++;

            // Remove old character
            freq2[s2.charAt(right - windowSize) - 'a']--;

            // Compare frequencies
            if (Arrays.equals(freq1, freq2)) {

                System.out.println(true);

                return;
            }
        }

        System.out.println(false);
    }
}
