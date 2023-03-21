package com.leetcode.dynamicprogramming.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinCostClimbingStairs_746Test {

  private final MinCostClimbingStairs_746 solution = new MinCostClimbingStairs_746_Impl();

  @Test
  void minCostClimbingStairs_example1() {
    // given
    final int[] cost = {10, 15, 20};

    // when
    final int result = solution.minCostClimbingStairs(cost);

    // then
    assertEquals(15, result);
  }

  @Test
  void minCostClimbingStairs_example2() {
    // given
    final int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

    // when
    final int result = solution.minCostClimbingStairs(cost);

    // then
    assertEquals(6, result);
  }
}
