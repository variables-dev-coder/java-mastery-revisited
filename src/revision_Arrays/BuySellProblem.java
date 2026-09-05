package revision_Arrays;

public class BuySellProblem {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
