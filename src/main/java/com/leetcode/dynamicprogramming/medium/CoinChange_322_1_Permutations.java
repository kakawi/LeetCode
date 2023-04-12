package com.leetcode.dynamicprogramming.medium;

/**
 * Permutations O(n^s), n is number of coins and s is the amount.
 * Since we only need the min coins, so it is ok to visit a combination multiple times.
 *
 * Brute Force
 */
public class CoinChange_322_1_Permutations implements CoinChange_322 {

  private static final int NO_VALUE = -1;

  @Override
  public int coinChange(final int[] coins, int amount) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }

    int result = NO_VALUE;
    for (final int coin : coins) {
      final int currentResult = coinChange(coins, amount - coin);
      if (currentResult >= 0) {
        result = result == NO_VALUE ? currentResult + 1 : Math.min(result, currentResult + 1);
      }
    }

    return result;
  }
}
