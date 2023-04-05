package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoinChange_322Test {

  private final CoinChange_322 solution = new CoinChange_322_4_BFS();

  @Test
  void coinChange_example1() {
    // given
    final int[] coins = {1, 2, 5};
    final int amount = 11;

    // expected
    final int expected = 3;

    // when
    final int result = solution.coinChange(coins, amount);

    // then
    assertEquals(expected, result);
  }

  @Test
  void coinChange_example2() {
    // given
    final int[] coins = {2};
    final int amount = 3;

    // expected
    final int expected = -1;

    // when
    final int result = solution.coinChange(coins, amount);

    // then
    assertEquals(expected, result);
  }

  @Test
  void coinChange_example3() {
    // given
    final int[] coins = {1};
    final int amount = 0;

    // expected
    final int expected = 0;

    // when
    final int result = solution.coinChange(coins, amount);

    // then
    assertEquals(expected, result);
  }

  @Test
  void coinChange_example4() {
    // given
    final int[] coins = {2, 5, 10, 1};
    final int amount = 27;

    // expected
    final int expected = 4;

    // when
    final int result = solution.coinChange(coins, amount);

    // then
    assertEquals(expected, result);
  }

  @Test
  void coinChange_example5() {
    // given
    final int[] coins = {186, 419, 83, 408};
    final int amount = 6249;

    // expected
    final int expected = 20;

    // when
    final int result = solution.coinChange(coins, amount);

    // then
    assertEquals(expected, result);
  }
}
