package com.leetcode.prefixsum.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LeftAndRightSumDifferences_2574Test {

  private final LeftAndRightSumDifferences_2574 solution = new LeftAndRightSumDifferences_2574_Impl();

  @Test
  void leftRightDifference_example1() {
    // given
    final int[] nums = {10, 4, 8, 3};

    // expected
    final int[] expected = {15, 1, 11, 22};

    // when
    final int[] result = solution.leftRigthDifference(nums);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void leftRightDifference_example2() {
    // given
    final int[] nums = {1};

    // expected
    final int[] expected = {0};

    // when
    final int[] result = solution.leftRigthDifference(nums);

    // then
    assertArrayEquals(expected, result);
  }
}
