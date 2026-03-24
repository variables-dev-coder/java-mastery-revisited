package logic_Array.revision2;

public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        BestTimeBuySellStock sol = new BestTimeBuySellStock();

        int[] prices = {7,1,5,3,6,4};

        System.out.println(sol.maxProfit(prices)); // 5
    }
}
