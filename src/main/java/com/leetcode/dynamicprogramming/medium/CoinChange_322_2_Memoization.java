package com.leetcode.dynamicprogramming.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Memoization, O(ns) pseudo polynomial dfs.
 * Using Map that stores previous results
 */
public class CoinChange_322_2_Memoization implements CoinChange_322 {

  @Override
  public int coinChange(final int[] coins, final int amount) {
    final Map<Integer, Integer> map = new HashMap<>();
    return coinChange(coins, amount, map);
  }

  private int coinChange(
      final int[] coins,
      final int amount,
      final Map<Integer, Integer> map
  ) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    Integer c = map.get(amount);
    if (c != null) {
      return c;
    }
    int result = -1;
    for (int i = 0; i < coins.length; i++) {
      int coin = coinChange(coins, amount - coins[i], map);
      if (coin >= 0) {
        result = result < 0 ? coin + 1 : Math.min(result, coin + 1);
      }
    }
    map.put(amount, result);
    return result;
  }
}
