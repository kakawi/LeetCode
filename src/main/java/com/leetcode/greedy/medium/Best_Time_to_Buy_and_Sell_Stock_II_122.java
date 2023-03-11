package com.leetcode.greedy.medium;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {

  public static void main(String[] args) {
    final Best_Time_to_Buy_and_Sell_Stock_II_122 solution = new Best_Time_to_Buy_and_Sell_Stock_II_122();
    solution.maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
    solution.maxProfit2(new int[]{1});
  }

  public int maxProfit(int[] prices) {
    if (prices.length < 1) {
      return 0;
    }

    int totalProfit = 0;
    int startPrice = prices[0];
    int prevPrice = prices[0];
    int currentPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {
      currentPrice = prices[i];
      if (currentPrice < prevPrice) {
        totalProfit += prevPrice - startPrice;
        startPrice = currentPrice;
      }
      prevPrice = currentPrice;
    }

    final int lastProfit = profit(startPrice, currentPrice);
    return totalProfit + lastProfit;
  }
  private static int profit(int minPrice, int maxPrice) {
    return maxPrice - minPrice;
  }

  /**
   * Again it can be faster then my solution
   */
  public int maxProfit2(int[] prices) {
    int prevPrice = prices[0], profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < prevPrice) {
        prevPrice = prices[i];
        continue;
      }
      profit += prices[i] - prevPrice;
      prevPrice = prices[i];
    }
    return profit;
  }

}
