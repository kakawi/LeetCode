package com.leetcode.simulation.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HappyNumber_202Test {

  private final HappyNumber_202 solution = new HappyNumber_202_FloydCycle();

  @Test
  void isHappy_example1() {
    // given
    final int n = 19;

    // when
    final boolean result = solution.isHappy(n);

    // then
    assertTrue(result);
  }

  @Test
  void isHappy_example2() {
    // given
    final int n = 2;

    // when
    final boolean result = solution.isHappy(n);

    // then
    assertFalse(result);
  }
}
