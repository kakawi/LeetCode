package com.leetcode.prefixsum.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContinuousSubarraySum_523Test {

  private final ContinuousSubarraySum_523 solution = new ContinuousSubarraySum_523_Impl();

  @Test
  void checkSubarraySum_example1() {
    // given
    final int[] nums = {23, 2, 4, 6, 7};
    final int k = 6;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertTrue(result);
  }

  @Test
  void checkSubarraySum_example2() {
    // given
    final int[] nums = {23, 2, 6, 4, 7};
    final int k = 6;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertTrue(result);
  }

  @Test
  void checkSubarraySum_example3() {
    // given
    final int[] nums = {23, 2, 6, 4, 7};
    final int k = 13;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertFalse(result);
  }

  @Test
  void checkSubarraySum_example4() {
    // given
    final int[] nums = {0};
    final int k = 1;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertFalse(result);
  }

  @Test
  void checkSubarraySum_example5() {
    // given
    final int[] nums = {5, 0, 0, 0};
    final int k = 3;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertTrue(result);
  }

  @Test
  void checkSubarraySum_example6() {
    // given
    final int[] nums = {2, 4, 3};
    final int k = 6;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertTrue(result);
  }

  @Test
  void checkSubarraySum_example7() {
    // given
    final int[] nums = {1, 0};
    final int k = 2;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertFalse(result);
  }

  @Test
  void checkSubarraySum_example8() {
    // given
    final int[] nums = {0, 0};
    final int k = 1;

    // when
    final boolean result = solution.checkSubarraySum(nums, k);

    // then
    assertTrue(result);
  }
}
