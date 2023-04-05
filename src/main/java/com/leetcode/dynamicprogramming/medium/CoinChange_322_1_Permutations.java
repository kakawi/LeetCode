package com.leetcode.dynamicprogramming.medium;

/**
 * Permutations O(n^s), n is number of coins and s is the amount.
 * Since we only need the min coins, so it is ok to visit a combination multiple times.
 *
 * Brute Force
 */
public class CoinChange_322_1_Permutations implements CoinChange_322 {

  @Override
  public int coinChange(final int[] coins, int amount) {
    if (amount < 0) {
      return -1;
    }
    if (amount == 0) {
      return 0;
    }
    int result = -1;
    for (int i = 0; i < coins.length; i++) {
      int coin = coinChange(coins, amount - coins[i]);
      if (coin >= 0) {
        result = result < 0 ? coin + 1 : Math.min(result, coin + 1);
      }
    }
    return result;
  }
}
