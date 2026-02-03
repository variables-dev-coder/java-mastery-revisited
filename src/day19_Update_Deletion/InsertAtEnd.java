package day19_Update_Deletion;

public class InsertAtEnd {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int size = 5;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int value = 60;

        arr[size] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

