package com.leetcode.greedy.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStock_121Test {

  private final BestTimeToBuyAndSellStock_121 solution = new BestTimeToBuyAndSellStock_121_Impl();

  @Test
  void maxProfit_example1() {
    // given
    final int[] prices = {7, 1, 5, 3, 6, 4};

    // expected
    final int expected = 5;

    // when
    final int result = solution.maxProfit(prices);

    // then
    assertEquals(expected, result);
  }

  @Test
  void maxProfit_example2() {
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