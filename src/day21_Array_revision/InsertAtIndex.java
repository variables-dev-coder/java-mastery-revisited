package day21_Array_revision;

public class InsertAtIndex {

    public static void main(String[] args) {

        int[] arr = new int[6];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int index = 2;
        int value = 25;

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
