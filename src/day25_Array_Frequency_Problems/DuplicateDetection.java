package day25_Array_Frequency_Problems;

public class DuplicateDetection {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2};

        int[] freq = new int[5];
        boolean found = false;

        for (int num : arr) {
            freq[num]++;

            if (freq[num] > 1) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Duplicate Found" : "No Duplicate");
    }
}
