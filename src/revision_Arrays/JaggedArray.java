package revision_Arrays;

public class JaggedArray {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20},
                {30, 40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Row " + i + ": ");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
