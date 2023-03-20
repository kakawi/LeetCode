package com.leetcode.graph.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FloodFill_733Test {

  private final FloodFill_733 solution = new FloodFill_733_Impl();

  @Test
  void floodFill_example1() {
    // given
    final int[][] image = new int[][]{
        new int[]{1, 1, 1},
        new int[]{1, 1, 0},
        new int[]{1, 0, 1}
    };
    final int sr = 1;
    final int sc = 1;
    final int color = 2;

    // expected
    final int[][] expected = new int[][]{
        new int[]{2, 2, 2},
        new int[]{2, 2, 0},
        new int[]{2, 0, 1}
    };

    // when
    final int[][] result = solution.floodFill(image, sr, sc, color);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void floodFill_example2() {
    // given
    final int[][] image = new int[][]{
        new int[]{0, 0, 0},
        new int[]{0, 0, 0}
    };
    final int sr = 0;
    final int sc = 0;
    final int color = 0;

    // expected
    final int[][] expected = new int[][]{
        new int[]{0, 0, 0},
        new int[]{0, 0, 0}
    };

    // when
    final int[][] result = solution.floodFill(image, sr, sc, color);

    // then
    assertArrayEquals(expected, result);
  }
}
