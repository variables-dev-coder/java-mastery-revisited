package logic_Array.revision_1_15_days;

public class Day6_RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int j = 0; // slow pointer (last unique index)

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int newLength = j + 1;

        // print unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew Length = " + newLength);
    }
}
