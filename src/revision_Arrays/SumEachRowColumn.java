package revision_Arrays;

public class SumEachRowColumn {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Row sums
        System.out.println("Row sums:");

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + i + " = " + sum);
        }

        // Column sums
        System.out.println("\nColumn sums:");

        for (int j = 0; j < matrix[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + j + " = " + sum);
        }
    }
}
