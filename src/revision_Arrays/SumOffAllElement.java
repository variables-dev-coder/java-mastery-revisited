package revision_Arrays;

public class SumOffAllElement {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                sum += matrix[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
