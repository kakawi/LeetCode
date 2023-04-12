package com.leetcode.dynamicprogramming.medium;

/**
 * TLE - Time Limit Exceeded
 */
public class CoinChange_322_5_Recursion implements CoinChange_322 {

  private static final int EMPTY_VALUE = -1;

  @Override
  public int coinChange(final int[] coins, final int amount) {
    if (amount == 0) {
      return 0;
    }
    int[] min = {EMPTY_VALUE};
    solve(coins, amount, 0, min);
    return min[0];
  }

  private void solve(final int[] coins, final int amount, final int numberOfCoins,
      final int[] min) {
    for (final int coin : coins) {
      if (coin == amount) {
        if (min[0] == EMPTY_VALUE) {
          min[0] = numberOfCoins + 1;
        } else {
          min[0] = Math.min(numberOfCoins + 1, min[0]);
        }
        continue;
      }
      if (coin > amount) {
        continue;
      }
      solve(coins, amount - coin, numberOfCoins + 1, min);
    }
  }
}
