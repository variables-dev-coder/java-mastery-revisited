package revision_Arrays;

public class MoveAllZerosEnd2 {

    static void moveZeros(int[] arr) {

        int write = 0;

        for (int read = 0; read < arr.length; read++) {

            if (arr[read] != 0) {

                int temp = arr[write];
                arr[write] = arr[read];
                arr[read] = temp;

                write++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
