package com.leetcode.graph.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PacificAtlanticWaterFlow_417Test {

  private final PacificAtlanticWaterFlow_417 solution = new PacificAtlanticWaterFlow_417_DFS();

  @Test
  void pacificAtlantic_example1() {
    // given
    final int[][] heights = {
        {1, 2, 2, 3, 5},
        {3, 2, 3, 4, 4},
        {2, 4, 5, 3, 1},
        {6, 7, 1, 4, 5},
        {5, 1, 1, 2, 4}
    };

    // expected
    final List<List<Integer>> expected = List.of(
        List.of(0, 4),
        List.of(1, 3),
        List.of(1, 4),
        List.of(2, 2),
        List.of(3, 0),
        List.of(3, 1),
        List.of(4, 0)
    );

    // when
    final List<List<Integer>> result = solution.pacificAtlantic(heights);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pacificAtlantic_example2() {
    // given
    final int[][] heights = {{1}};

    // expected
    final List<List<Integer>> expected = List.of(List.of(0, 0));

    // when
    final List<List<Integer>> result = solution.pacificAtlantic(heights);

    // then
    assertEquals(expected, result);
  }
}
