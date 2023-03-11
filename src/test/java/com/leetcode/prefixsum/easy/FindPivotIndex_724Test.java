package com.leetcode.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindPivotIndex_724Test {

  private final FindPivotIndex_724 solution = new FindPivotIndex_724_Impl();

  @Test
  void pivotIndex_example1() {
    // given
    final int[] input = {1, 7, 3, 6, 5, 6};

    // expected
    final int expected = 3;

    // when
    final int result = solution.pivotIndex(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pivotIndex_example2() {
    // given
    final int[] input = {1, 2, 3};

    // expected
    final int expected = -1;

    // when
    final int result = solution.pivotIndex(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void pivotIndex_example3() {
    // given
    final int[] input = {2, 1, -1};

    // expected
    final int expected = 0;

    // when
    final int result = solution.pivotIndex(input);

    // then
    assertEquals(expected, result);
  }
}