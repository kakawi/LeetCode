package com.leetcode.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RunningSumOf1DArray_1480Test {

  private final RunningSumOf1dArray_1480 solution = new RunningSumOf1dArray_1480_Impl();

  @Test
  void runningSum_example1() {
    // given
    final int[] input = {1, 2, 3, 4};

    // expected
    final int[] expected = {1, 3, 6, 10};

    // when
    final int[] result = solution.runningSum(input);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void runningSum_example2() {
    // given
    final int[] input = {1, 1, 1, 1, 1};

    // expected
    final int[] expected = {1, 2, 3, 4, 5};

    // when
    final int[] result = solution.runningSum(input);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void runningSum_example3() {
    // given
    final int[] input = {3, 1, 2, 10, 1};

    // expected
    final int[] expected = {3, 4, 6, 16, 17};

    // when
    final int[] result = solution.runningSum(input);

    // then
    assertArrayEquals(expected, result);
  }
}
