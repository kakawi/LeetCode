package com.leetcode.graph.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RottingOranges_944Test {

  private final RottingOranges_944 solution = new RottingOranges_944_BFS();

  @Test
  void orangesRotting_example1() {
    // given
    final int[][] grid = {
        {2, 1, 1},
        {1, 1, 0},
        {0, 1, 1}
    };

    // expected
    final int expected = 4;

    // when
    final int result = solution.orangesRotting(grid);

    // then
    assertEquals(expected, result);
  }

  @Test
  void orangesRotting_example2() {
    // given
    final int[][] grid = {
        {2, 1, 1},
        {0, 1, 1},
        {1, 0, 1}
    };

    // expected
    final int expected = -1;

    // when
    final int result = solution.orangesRotting(grid);

    // then
    assertEquals(expected, result);
  }

  @Test
  void orangesRotting_example3() {
    // given
    final int[][] grid = {{0, 2}};

    // expected
    final int expected = 0;

    // when
    final int result = solution.orangesRotting(grid);

    // then
    assertEquals(expected, result);
  }

  @Test
  void orangesRotting_example4() {
    // given
    final int[][] grid = {
        {2, 1, 1},
        {1, 1, 1},
        {0, 1, 2}
    };

    // expected
    final int expected = 2;

    // when
    final int result = solution.orangesRotting(grid);

    // then
    assertEquals(expected, result);
  }
}
