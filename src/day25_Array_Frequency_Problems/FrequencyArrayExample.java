package day25_Array_Frequency_Problems;

public class FrequencyArrayExample {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4,2};

        int max = 4;
        int[] freq = new int[max + 1];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
