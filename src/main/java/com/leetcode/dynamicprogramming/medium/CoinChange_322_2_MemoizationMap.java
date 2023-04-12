package com.leetcode.dynamicprogramming.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Memoization, O(ns) pseudo polynomial dfs.
 * Using Map that stores previous results
 */
public class CoinChange_322_2_MemoizationMap implements CoinChange_322 {

  private static final int NO_VALUE = -1;

  @Override
  public int coinChange(final int[] coins, final int amount) {
    final Map<Integer, Integer> memoization = new HashMap<>();
    return coinChange(coins, amount, memoization);
  }

  private int coinChange(
      final int[] coins,
      final int amount,
      final Map<Integer, Integer> memoization
  ) {
    if (amount < 0) {
      return NO_VALUE;
    }
    if (amount == 0) {
      return 0;
    }
    if (memoization.containsKey(amount)) {
      return memoization.get(amount);
    }
    int result = NO_VALUE;
    for (final int coin : coins) {
      final int currentResult = coinChange(coins, amount - coin, memoization);
      if (currentResult >= 0) {
        result = result == NO_VALUE ? currentResult + 1 : Math.min(result, currentResult + 1);
      }
    }
    memoization.put(amount, result);
    return result;
  }
}
