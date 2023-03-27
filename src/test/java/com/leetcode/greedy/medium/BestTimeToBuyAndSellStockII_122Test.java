package com.leetcode.greedy.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockII_122Test {

  private final BestTimeToBuyAndSellStockII_122 solution = new BestTimeToBuyAndSellStockII_122_Impl();

  @Test
  void maxProfit_example1() {
    // given
    final int[] prices = {7, 1, 5, 3, 6, 4};

    // expected
    final int expected = 7;

    // when
    final int result = solution.maxProfit(prices);

    // then
    assertEquals(expected, result);
  }

  @Test
  void maxProfit_example2() {
    // given
    final int[] prices = {1, 2, 3, 4, 5};

    // expected
    final int expected = 4;

    // when
    final int result = solution.maxProfit(prices);

    // then
    assertEquals(expected, result);
  }

  @Test
  void maxProfit_example3() {
    // given
    final int[] prices = {7, 6, 4, 3, 1};

    // expected
    final int expected = 0;

    // when
    final int result = solution.maxProfit(prices);

    // then
    assertEquals(expected, result);
  }
}
