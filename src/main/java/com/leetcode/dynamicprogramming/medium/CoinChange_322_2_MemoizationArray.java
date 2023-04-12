package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Memoization, O(ns) pseudo polynomial dfs.
 * Using Map that stores previous results
 */
public class CoinChange_322_2_MemoizationArray implements CoinChange_322 {

  private static final int NO_VALUE = -2;
  private static final int IMPOSSIBLE = -1;

  @Override
  public int coinChange(final int[] coins, final int amount) {
    final int[] memoization = new int[amount + 1];
    Arrays.fill(memoization, NO_VALUE);
    return coinChange(coins, amount, memoization);
  }

  private int coinChange(
      final int[] coins,
      final int amount,
      final int[] memoization
  ) {
    if (amount < 0) {
      return IMPOSSIBLE;
    }
    if (amount == 0) {
      return 0;
    }
    if (memoization[amount] != NO_VALUE) {
      return memoization[amount];
    }
    int result = IMPOSSIBLE;
    for (final int coin : coins) {
      final int currentResult = coinChange(coins, amount - coin, memoization);
      if (currentResult >= 0) {
        result = result == IMPOSSIBLE ? currentResult + 1 : Math.min(result, currentResult + 1);
      }
    }
    memoization[amount] = result;
    return result;
  }
}
