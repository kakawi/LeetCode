package com.leetcode.greedy.medium;

public class BestTimeToBuyAndSellStockII_122_Impl implements BestTimeToBuyAndSellStockII_122 {

  @Override
  public int maxProfit(final int[] prices) {
    int maxProfit = 0;
    int prevPrice = prices[0];

    for (final int price : prices) {
      if (prevPrice > price) {
        prevPrice = price;
        continue;
      }
      maxProfit += price - prevPrice;
      prevPrice = price;
    }

    return maxProfit;
  }
}
