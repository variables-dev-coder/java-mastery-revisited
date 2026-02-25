package logic_Array.revision;

public class RemoveDuplicatesSorted {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        if (arr.length == 0) {
            System.out.println("Length: 0");
            return;
        }

        int j = 0;  // slow pointer (last unique index)

        for (int i = 1; i < arr.length; i++) {  // fast pointer
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int newLength = j + 1;

        System.out.println("New Length: " + newLength);

        System.out.print("Unique Elements: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
