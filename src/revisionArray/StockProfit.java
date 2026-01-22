package revisionArray;

import java.util.Arrays;

public class StockProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println("=== Stock Profit Example ===");
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);

        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Maximum profit: " + result);
        System.out.println("Buy at day 2 (price=1), Sell at day 5 (price=6)");
        System.out.println("Profit: 6 - 1 = 5");
        System.out.println();
    }
}
