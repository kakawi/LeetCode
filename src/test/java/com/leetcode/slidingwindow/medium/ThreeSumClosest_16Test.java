package com.leetcode.slidingwindow.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThreeSumClosest_16Test {

  private final ThreeSumClosest_16 solution = new ThreeSumClosest_16_Impl();

  @Test
  void threeSumClosest_example1() {
    // given
    final int[] nums = {-1, 2, 1, -4};
    final int target = 1;

    // expected
    final int expected = 2;

    // when
    final int result = solution.threeSumClosest(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void threeSumClosest_example2() {
    // given
    final int[] nums = {0, 0, 0};
    final int target = 1;

    // expected
    final int expected = 0;

    // when
    final int result = solution.threeSumClosest(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void threeSumClosest_example3() {
    // given
    final int[] nums = {1, 1, 1, 0};
    final int target = -100;

    // expected
    final int expected = 2;

    // when
    final int result = solution.threeSumClosest(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void threeSumClosest_example4() {
    // given
    final int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
    final int target = -2;

    // expected
    final int expected = -2;

    // when
    final int result = solution.threeSumClosest(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void threeSumClosest_example5() {
    // given
    final int[] nums = {-1, 2, 1, -4};
    final int target = 1;

    // expected
    final int expected = 2;

    // when
    final int result = solution.threeSumClosest(nums, target);

    // then
    assertEquals(expected, result);
  }
}
