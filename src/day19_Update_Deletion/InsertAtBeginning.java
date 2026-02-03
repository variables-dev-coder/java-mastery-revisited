package day19_Update_Deletion;

public class InsertAtBeginning {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int value = 5;

        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

