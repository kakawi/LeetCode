package com.leetcode.unionfind.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MostStonesRemovedWithSameRowOrColumn_947Test {

  private final MostStonesRemovedWithSameRowOrColumn_947 solution = new MostStonesRemovedWithSameRowOrColumn_947_Impl();

  @Test
  void removeStones_example1() {
    // given
    final int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};

    // expected
    final int expected = 5;

    // when
    final int result = solution.removeStones(stones);

    // then
    assertEquals(expected, result);
  }

  @Test
  void removeStones_example2() {
    // given
    final int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};

    // expected
    final int expected = 3;

    // when
    final int result = solution.removeStones(stones);

    // then
    assertEquals(expected, result);
  }

  @Test
  void removeStones_example3() {
    // given
    final int[][] stones = {{0, 0}};

    // expected
    final int expected = 0;

    // when
    final int result = solution.removeStones(stones);

    // then
    assertEquals(expected, result);
  }
}
