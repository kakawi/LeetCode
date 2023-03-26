package com.leetcode.simulation.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SpiralMatrix_54Test {

  private final SpiralMatrix_54 solution = new SpiralMatrix_54_Impl();

  @Test
  void spiralOrder_example1() {
    // given
    final int[][] matrix = new int[][]{
        new int[]{1, 2, 3},
        new int[]{4, 5, 6},
        new int[]{7, 8, 9},
    };

    // expected
    final List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);

    // when
    final List<Integer> result = solution.spiralOrder(matrix);

    // then
    assertEquals(expected, result);
  }

  @Test
  void spiralOrder_example2() {
    // given
    final int[][] matrix = new int[][]{
        new int[]{1, 2, 3, 4},
        new int[]{5, 6, 7, 8},
        new int[]{9, 10, 11, 12},
    };

    // expected
    final List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);

    // when
    final List<Integer> result = solution.spiralOrder(matrix);

    // then
    assertEquals(expected, result);
  }

  @Test
  void spiralOrder_example3() {
    // given
    final int[][] matrix = new int[][]{
        new int[]{7},
        new int[]{9},
        new int[]{6},
    };

    // expected
    final List<Integer> expected = List.of(7, 9, 6);

    // when
    final List<Integer> result = solution.spiralOrder(matrix);

    // then
    assertEquals(expected, result);
  }
}
