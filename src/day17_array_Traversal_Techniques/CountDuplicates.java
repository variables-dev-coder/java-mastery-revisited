package day17_array_Traversal_Techniques;

public class CountDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 3, 3, 3, 4};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int duplicateCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Duplicate elements count = " + duplicateCount);
    }
}
