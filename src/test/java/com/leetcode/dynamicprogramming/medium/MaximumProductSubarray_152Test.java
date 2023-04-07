package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumProductSubarray_152Test {

  private final MaximumProductSubarray_152 solution = new MaximumProductSubarray_152_MinMax();

  @Test
  void maxProduct_example1() {
    // given
    final int[] nums = {2, 3, -2, 4};

    // expected
    final int expected = 6;

    // when
    final int result = solution.maxProduct(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void maxProduct_example2() {
    // given
    final int[] nums = {-2, 0, -1};

    // expected
    final int expected = 0;

    // when
    final int result = solution.maxProduct(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void maxProduct_example3() {
    // given
    final int[] nums = {0, 2};

    // expected
    final int expected = 2;

    // when
    final int result = solution.maxProduct(nums);

    // then
    assertEquals(expected, result);
  }
}
