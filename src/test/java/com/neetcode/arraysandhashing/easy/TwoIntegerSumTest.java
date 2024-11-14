package com.neetcode.arraysandhashing.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoIntegerSumTest {
  private final TwoIntegerSum solution = new TwoIntegerSum_Impl();

  @Test
  void example1() {
    // given
    final int[] nums = { 3, 4, 5, 6 };
    final int target = 7;

    // expected
    final int[] expected = { 0, 1 };

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    final int[] nums = { 4, 5, 6 };
    final int target = 10;

    // expected
    final int[] expected = { 0, 2 };

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void example3() {
    // given
    final int[] nums = { 5, 5 };
    final int target = 10;

    // expected
    final int[] expected = { 0, 1 };

    // when
    final int[] result = solution.twoSum(nums, target);

    // then
    assertArrayEquals(expected, result);
  }
}
