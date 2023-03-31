package com.leetcode.binarysearch.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Search2DMatrix_74Test {

  private final Search2DMatrix_74 solution = new Search2DMatrix_74_Impl();

  @Test
  void searchMatrix_example1() {
    // given
    final int[][] matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };
    final int target = 3;

    // when
    final boolean result = solution.searchMatrix(matrix, target);

    // then
    assertTrue(result);
  }

  @Test
  void searchMatrix_example2() {
    // given
    final int[][] matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };
    final int target = 13;

    // when
    final boolean result = solution.searchMatrix(matrix, target);

    // then
    assertFalse(result);
  }

  @Test
  void searchMatrix_example3() {
    // given
    final int[][] matrix = {{1}};
    final int target = 1;

    // when
    final boolean result = solution.searchMatrix(matrix, target);

    // then
    assertTrue(result);
  }

  @Test
  void searchMatrix_example4() {
    // given
    final int[][] matrix = {{1}};
    final int target = 2;

    // when
    final boolean result = solution.searchMatrix(matrix, target);

    // then
    assertFalse(result);
  }
}
