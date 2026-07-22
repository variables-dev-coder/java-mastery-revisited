package logic_Array.revision7;

import java.util.Arrays;

public class Candy {

    public static int candy(int[] ratings) {

        int n = ratings.length;

        int[] candies = new int[n];

        Arrays.fill(candies, 1);

        // Left to Right
        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) {

                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to Left
        for (int i = n - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {

                candies[i] = Math.max(candies[i],
                        candies[i + 1] + 1);
            }
        }

        int sum = 0;

        for (int c : candies)
            sum += c;

        return sum;
    }

    public static void main(String[] args) {

        int[] ratings = {1,0,2};

        System.out.println(candy(ratings));
    }
}
