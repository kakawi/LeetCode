package com.leetcode.greedy.easy;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

  public static void main(String[] args) {
    final Best_Time_to_Buy_and_Sell_Stock_121 solution = new Best_Time_to_Buy_and_Sell_Stock_121();
    solution.maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
  }

  /**
   * a bit more complicated
   * it's good for the next level of the task :)
   * P.S. not good at all :)
   */
  public int maxProfit(int[] prices) {
    if (prices.length < 1) {
      return 0;
    }

    int maxProfit = 0;
    int minPrice = prices[0];
    int maxPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {
      final int currentPrice = prices[i];
      if (currentPrice < minPrice) {
        if (maxProfit < profit(minPrice, maxPrice)) {
          maxProfit = profit(minPrice, maxPrice);
        }
        minPrice = currentPrice;
        maxPrice = currentPrice;
      }
      if (currentPrice > maxPrice) {
        maxPrice = currentPrice;
      }
    }

    final int lastProfit = profit(minPrice, maxPrice);

    return Math.max(maxProfit, lastProfit);
  }

  private static int profit(int minPrice, int maxPrice) {
    return maxPrice - minPrice;
  }

  /**
   * You're interested in the lowest price
   * Profit can be calculated on every iteration
   */
  public int maxProfit2(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    int currentProfit;

    for (final int currentPrice : prices) {
      if (currentPrice < minPrice) {
        minPrice = currentPrice;
      }
      currentProfit = currentPrice - minPrice;
      if (maxProfit < currentProfit) {
        maxProfit = currentProfit;
      }
    }
    return maxProfit;
  }
}
