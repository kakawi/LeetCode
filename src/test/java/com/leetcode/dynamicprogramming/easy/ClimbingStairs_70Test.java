package com.leetcode.dynamicprogramming.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairs_70Test {

  private final ClimbingStairs_70 solution = new ClimbingStairs_70_Impl();

  @Test
  void climbStairs_example1() {
    // given
    final int n = 2;

    // when
    final int result = solution.climbStairs(n);

    // then
    assertEquals(2, result);
  }

  @Test
  void climbStairs_example2() {
    // given
    final int n = 3;

    // when
    final int result = solution.climbStairs(n);

    // then
    assertEquals(3, result);
  }
}
