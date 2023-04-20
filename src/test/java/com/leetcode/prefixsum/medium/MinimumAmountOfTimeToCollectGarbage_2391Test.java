package com.leetcode.prefixsum.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumAmountOfTimeToCollectGarbage_2391Test {

  private final MinimumAmountOfTimeToCollectGarbage_2391 solution = new MinimumAmountOfTimeToCollectGarbage_2391_Impl();

  @Test
  void garbageCollection_example1() {
    // given
    final String[] garbage = {"G", "P", "GP", "GG"};
    final int[] travel = {2, 4, 3};

    // expected
    final int expected = 21;

    // when
    final int result = solution.garbageCollection(garbage, travel);

    // then
    assertEquals(expected, result);
  }

  @Test
  void garbageCollection_example2() {
    // given
    final String[] garbage = {"MMM", "PGM", "GP"};
    final int[] travel = {3, 10};

    // expected
    final int expected = 37;

    // when
    final int result = solution.garbageCollection(garbage, travel);

    // then
    assertEquals(expected, result);
  }

  @Test
  void garbageCollection_example3() {
    // given
    final String[] garbage = {"G", "M"};
    final int[] travel = {1};

    // expected
    final int expected = 3;

    // when
    final int result = solution.garbageCollection(garbage, travel);

    // then
    assertEquals(expected, result);
  }
}
