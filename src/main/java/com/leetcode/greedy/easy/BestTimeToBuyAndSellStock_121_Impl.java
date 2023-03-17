package com.leetcode.greedy.easy;

public class BestTimeToBuyAndSellStock_121_Impl implements BestTimeToBuyAndSellStock_121 {

  @Override
  public int maxProfit(final int[] prices) {
    int minPrice = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      } else if (prices[i] - minPrice > profit) {
        profit = prices[i] - minPrice;
      }
    }
    return profit;
  }
}
