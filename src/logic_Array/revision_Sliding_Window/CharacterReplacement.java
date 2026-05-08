package logic_Array.revision_Sliding_Window;

public class CharacterReplacement {

    public static void main(String[] args) {

        String s = "AABABBA";

        int k = 1;

        int[] freq = new int[26];

        int left = 0;

        int maxFreq = 0;

        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            freq[ch - 'A']++;

            maxFreq =
                    Math.max(maxFreq,
                            freq[ch - 'A']);

            int windowSize = right - left + 1;

            // Invalid window
            while ((windowSize - maxFreq) > k) {

                freq[s.charAt(left) - 'A']--;

                left++;

                windowSize = right - left + 1;
            }

            maxLength =
                    Math.max(maxLength,
                            windowSize);
        }

        System.out.println("Longest Length: " + maxLength);
    }
}
