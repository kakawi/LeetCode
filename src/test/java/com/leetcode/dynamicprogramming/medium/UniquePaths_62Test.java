package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniquePaths_62Test {

  private final UniquePaths_62 solution = new UniquePaths_62_Array();

  @Test
  void uniquePaths_example1() {
    // given
    final int m = 3;
    final int n = 7;

    // when
    final int result = solution.uniquePaths(m, n);

    // then
    assertEquals(28, result);
  }

  @Test
  void uniquePaths_example2() {
    // given
    final int m = 3;
    final int n = 2;

    // when
    final int result = solution.uniquePaths(m, n);

    // then
    assertEquals(3, result);
  }

  @Test
  void uniquePaths_example3() {
    // given
    final int m = 23;
    final int n = 12;

    // when
    final int result = solution.uniquePaths(m, n);

    // then
    assertEquals(193536720, result);
  }
}
