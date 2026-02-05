package day19_Update_Deletion;

public class AllDeleteOperations {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int size = arr.length;

        // 1. Delete at Beginning (index 0)
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        // 2. Delete at Index (index = 2)
        int deleteIndex = 2;
        for (int i = deleteIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        // 3. Delete at End
        size--;

        // 4. Delete by Value (value = 40)
        int value = 40;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        // Print final array
        System.out.println("Array after all deletions:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

