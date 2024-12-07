package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumSubarray_53Test {
  private final MaximumSubarray_53 solution = new MaximumSubarray_53_DivideAndConquer();

  @Test
  void example1() {
    // given
    int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    // expected
    int expected = 6;

    // when
    int result = solution.maxSubArray(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] input = { 1 };

    // expected
    int expected = 1;

    // when
    int result = solution.maxSubArray(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example3() {
    // given
    int[] input = { 5, 4, -1, 7, 8 };

    // expected
    int expected = 23;

    // when
    int result = solution.maxSubArray(input);

    // then
    assertEquals(expected, result);
  }
}
