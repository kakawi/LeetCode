package com.leetcode.interval.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class InsertInterval_57Test {

  private final InsertInterval_57 solution = new InsertInterval_57_Impl();

  @Test
  void insert_example1_extend() {
    // given
    final int[][] intervals = {
        {1, 3},
        {6, 9}
    };
    final int[] newInterval = {2, 5};

    // expected
    final int[][] expected = {
        {1, 5},
        {6, 9}
    };

    // when
    final int[][] result = solution.insert(intervals, newInterval);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void insert_example2_merge() {
    // given
    final int[][] intervals = {
        {1, 2},
        {3, 5},
        {6, 7},
        {8, 10},
        {12, 16}
    };
    final int[] newInterval = {4, 8};

    // expected
    final int[][] expected = {
        {1, 2},
        {3, 10},
        {12, 16}
    };

    // when
    final int[][] result = solution.insert(intervals, newInterval);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void insert_example3_first() {
    // given
    final int[][] intervals = {
        {5, 6},
        {7, 9}
    };
    final int[] newInterval = {2, 4};

    // expected
    final int[][] expected = {
        {2, 4},
        {5, 6},
        {7, 9},
    };

    // when
    final int[][] result = solution.insert(intervals, newInterval);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void insert_example4_last() {
    // given
    final int[][] intervals = {
        {5, 6},
        {7, 9}
    };
    final int[] newInterval = {10, 12};

    // expected
    final int[][] expected = {
        {5, 6},
        {7, 9},
        {10, 12},
    };

    // when
    final int[][] result = solution.insert(intervals, newInterval);

    // then
    assertArrayEquals(expected, result);
  }
}
