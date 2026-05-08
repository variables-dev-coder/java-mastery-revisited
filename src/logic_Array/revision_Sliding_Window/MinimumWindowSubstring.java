package logic_Array.revision_Sliding_Window;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] targetFreq = new int[128];
        int[] windowFreq = new int[128];

        // Store target frequencies
        for (char ch : t.toCharArray()) {

            targetFreq[ch]++;
        }

        int left = 0;

        int matched = 0;

        int minLength = Integer.MAX_VALUE;

        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            windowFreq[rightChar]++;

            // Match found
            if (targetFreq[rightChar] > 0 &&
                    windowFreq[rightChar]
                            <= targetFreq[rightChar]) {

                matched++;
            }

            // Shrink valid window
            while (matched == t.length()) {

                // Update minimum
                if (right - left + 1 < minLength) {

                    minLength = right - left + 1;

                    start = left;
                }

                char leftChar = s.charAt(left);

                windowFreq[leftChar]--;

                // Window becomes invalid
                if (targetFreq[leftChar] > 0 &&
                        windowFreq[leftChar]
                                < targetFreq[leftChar]) {

                    matched--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {

            System.out.println("");
        } else {

            System.out.println(
                    s.substring(start,
                            start + minLength));
        }
    }
}
