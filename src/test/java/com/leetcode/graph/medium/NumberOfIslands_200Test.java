package com.leetcode.graph.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberOfIslands_200Test {

  private final NumberOfIslands_200 solution = new NumberOfIslands_200_Impl();

  @Test
  void numIslands_example1() {
    // given
    final char[][] grid = new char[][]{
        new char[]{'1', '1', '1', '1', '0'},
        new char[]{'1', '1', '0', '1', '0'},
        new char[]{'1', '1', '0', '0', '0'},
        new char[]{'0', '0', '0', '0', '0'}
    };

    // when
    final int result = solution.numIslands(grid);

    // then
    assertEquals(1, result);
  }

  @Test
  void numIslands_example2() {
    // given
    final char[][] grid = new char[][]{
        new char[]{'1', '1', '0', '0', '0'},
        new char[]{'1', '1', '0', '0', '0'},
        new char[]{'0', '0', '1', '0', '0'},
        new char[]{'0', '0', '0', '1', '1'}
    };

    // when
    final int result = solution.numIslands(grid);

    // then
    assertEquals(3, result);
  }
}
