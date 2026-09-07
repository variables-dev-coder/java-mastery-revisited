package revision_Arrays;

public class BuySellStock2 {

    static int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // If today's price is higher,
            // capture the increase.
            if (prices[i] > prices[i - 1]) {

                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);

        System.out.println("Maximum profit = " + answer);
    }
}
