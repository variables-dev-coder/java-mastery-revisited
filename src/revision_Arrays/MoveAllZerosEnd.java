package revision_Arrays;

public class MoveAllZerosEnd {

    static void moveZeros(int[] arr) {

        int write = 0;

        // Move all non-zero elements to the front
        for (int read = 0; read < arr.length; read++) {

            if (arr[read] != 0) {

                arr[write] = arr[read];
                write++;
            }
        }

        // Fill remaining positions with zero
        while (write < arr.length) {

            arr[write] = 0;
            write++;
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
