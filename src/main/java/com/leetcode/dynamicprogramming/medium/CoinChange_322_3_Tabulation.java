package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * dp O(ns) pseudo polynomial. From #1, we can see that f(x)=min(1+f(x-ci))
 * Idea: using array of all possible amounts - [0, amount]
 */
public class CoinChange_322_3_Tabulation implements CoinChange_322 {

  @Override
  public int coinChange(int[] coins, int amount) {
    // we use `allAmounts` as a Map for previous values
    final long[] allAmounts = new long[amount + 1];
    // we just fill with in advance big number (we can use amount + 1 too)
    Arrays.fill(allAmounts, Integer.MAX_VALUE);
    allAmounts[0] = 0; // 0 target - 0 result

    // Loop will till the desired number
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i >= coin) {
          // TODO you can add checking on Integer.MAX_VALUE not to exceed max Integer
          allAmounts[i] = Math.min(allAmounts[i], allAmounts[i - coin] + 1);
        }
      }
    }

    // We didn't find the answer
    if (allAmounts[amount] > amount) {
      return -1;
    }

    return (int) allAmounts[amount];
  }
}
