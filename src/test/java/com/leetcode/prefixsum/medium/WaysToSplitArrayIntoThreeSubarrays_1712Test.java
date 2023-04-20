package com.leetcode.prefixsum.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WaysToSplitArrayIntoThreeSubarrays_1712Test {

  private final WaysToSplitArrayIntoThreeSubarrays_1712 solution = new WaysToSplitArrayIntoThreeSubarrays_1712_Impl();

  @Test
  void waysToSplit_example1() {
    // given
    final int[] nums = {1, 1, 1};

    // expected
    final int expected = 1;

    // when
    final int result = solution.waysToSplit(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void waysToSplit_example2() {
    // given
    final int[] nums = {1, 2, 2, 2, 5, 0};

    // expected
    final int expected = 3;

    // when
    final int result = solution.waysToSplit(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void waysToSplit_example3() {
    // given
    final int[] nums = {3, 2, 1};

    // expected
    final int expected = 0;

    // when
    final int result = solution.waysToSplit(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void waysToSplit_example4() {
    // given
    final int[] nums = {0, 3, 3};

    // expected
    final int expected = 1;

    // when
    final int result = solution.waysToSplit(nums);

    // then
    assertEquals(expected, result);
  }
}
