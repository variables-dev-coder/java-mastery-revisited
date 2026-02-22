package day25_Array_Frequency_Problems;

public class FirstNonRepeating {
    public static void main(String[] args) {

        int[] arr = {4,5,1,2,0,4};

        int[] freq = new int[6];

        for (int num : arr) {
            freq[num]++;
        }

        for (int num : arr) {
            if (freq[num] == 1) {
                System.out.println("First Non-Repeating: " + num);
                break;
            }
        }
    }
}
