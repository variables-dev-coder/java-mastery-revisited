package logic_Array.revision2;

import java.util.*;

public class BestTimeStock {

    public static int maxProfit(int[] prices){

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price : prices){

            min = Math.min(min,price);

            profit = Math.max(profit,
                    price - min);
        }

        return profit;
    }

    public static void main(String[] args){

        int prices[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
