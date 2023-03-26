package com.leetcode.simulation.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class WhereWillTheBallFall_1706Test {

  private final WhereWillTheBallFall_1706 solution = new WhereWillTheBallFall_1706_StreamApi();

  @Test
  void findBall_example1() {
    // given
    final int[][] grid = new int[][]{
        new int[]{1, 1, 1, -1, -1},
        new int[]{1, 1, 1, -1, -1},
        new int[]{-1, -1, -1, 1, 1},
        new int[]{1, 1, 1, 1, -1},
        new int[]{-1, -1, -1, -1, -1}
    };

    // expected
    final int[] expected = new int[]{1, -1, -1, -1, -1};

    // when
    final int[] result = solution.findBall(grid);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void findBall_example2() {
    // given
    final int[][] grid = new int[][]{
        new int[]{-1}
    };

    // expected
    final int[] expected = new int[]{-1};

    // when
    final int[] result = solution.findBall(grid);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void findBall_example3() {
    // given
    final int[][] grid = new int[][]{
        new int[]{1, 1, 1, 1, 1, 1},
        new int[]{-1, -1, -1, -1, -1, -1},
        new int[]{1, 1, 1, 1, 1, 1},
        new int[]{-1, -1, -1, -1, -1, -1},
    };

    // expected
    final int[] expected = new int[]{0, 1, 2, 3, 4, -1};

    // when
    final int[] result = solution.findBall(grid);

    // then
    assertArrayEquals(expected, result);
  }
}
