package day19_Update_Deletion;

public class AllInsertOperations {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int size = 5;

        // Initial array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 1. Insert at Beginning
        int insertBegin = 5;
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = insertBegin;
        size++;

        // 2. Insert at Middle (index = 3)
        int insertMiddle = 25;
        int index = 3;
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = insertMiddle;
        size++;

        // 1. Insert at End
        int insertEnd = 60;
        arr[size] = insertEnd;
        size++;

        // Print final array
        System.out.println("Array after all insertions:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

