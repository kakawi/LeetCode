package com.leetcode.interval.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class MergeIntervals_56Test {

  private final MergeIntervals_56 solution = new MergeIntervals_56_Sort();

  @Test
  void merge_example1() {
    // given
    final int[][] intervals = {
        {1, 3},
        {2, 6},
        {8, 10},
        {15, 18}
    };

    //  expected
    final int[][] expected = {
        {1, 6},
        {8, 10},
        {15, 18}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void merge_example2() {
    // given
    final int[][] intervals = {
        {1, 4},
        {4, 5}
    };

    //  expected
    final int[][] expected = {
        {1, 5}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void merge_example3() {
    // given
    final int[][] intervals = {
        {1, 4},
        {0, 4}
    };

    //  expected
    final int[][] expected = {
        {0, 4}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void merge_example4() {
    // given
    final int[][] intervals = {
        {1, 4},
        {0, 0}
    };

    //  expected
    final int[][] expected = {
        {0, 0}, {1, 4}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertThat(result, Matchers.arrayContainingInAnyOrder(expected));
  }

  @Test
  void merge_example5() {
    // given
    final int[][] intervals = {
        {1, 4},
        {0, 1}
    };

    //  expected
    final int[][] expected = {
        {0, 4}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertThat(result, Matchers.arrayContainingInAnyOrder(expected));
  }

  @Test
  void merge_example6() {
    // given
    final int[][] intervals = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};

    //  expected
    final int[][] expected = {
        {1, 10}
    };

    // when
    final int[][] result = solution.merge(intervals);

    // then
    assertThat(result, Matchers.arrayContainingInAnyOrder(expected));
  }
}
