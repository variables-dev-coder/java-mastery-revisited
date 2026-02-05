package day20_Array_ArrayList;

public class ArrayInsertDelete {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int size = 3;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // insert at index 1

        for (int i = size - 1; i >= 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[1] = 15;
        size++;

        // Delete at index 2
        for (int i = 2; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        System.out.println("Array after insert & delete: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Manual shifting
//Logical size handling
//Why array updates are costly