package revisionArray;

public class DeleteAtIndex {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        int index = 1;

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
