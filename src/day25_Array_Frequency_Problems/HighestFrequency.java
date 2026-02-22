package day25_Array_Frequency_Problems;

public class HighestFrequency {
    public static void main(String[] args) {

        int[] arr = {1,3,2,1,4,1,2};

        int[] freq = new int[5];

        for (int num : arr) {
            freq[num]++;
        }

        int maxFreq = 0;
        int element = -1;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                element = i;
            }
        }

        System.out.println("Element: " + element);
        System.out.println("Frequency: " + maxFreq);
    }
}
