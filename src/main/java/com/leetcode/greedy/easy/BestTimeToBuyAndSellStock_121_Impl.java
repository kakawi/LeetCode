package com.leetcode.greedy.easy;

public class BestTimeToBuyAndSellStock_121_Impl implements
    BestTimeToBuyAndSellStock_121 {

  @Override
  public int maxProfit(final int[] prices) {
    int maxProfit = 0;
    int minPrice = prices[0];
    for (final int currentPrice : prices) {
      if (currentPrice < minPrice) {
        minPrice = currentPrice;
        continue;
      }
      int profit = currentPrice - minPrice;
      maxProfit = Math.max(maxProfit, profit);
    }
    return maxProfit;
  }
}
