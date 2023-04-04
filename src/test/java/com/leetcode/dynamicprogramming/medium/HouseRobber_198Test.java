package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobber_198Test {

  private final HouseRobber_198 solution = new HouseRobber_198_DFS();

  @Test
  void rob_example1() {
    // given
    final int[] nums = {1, 2, 3, 1};

    // expected
    final int expected = 4;

    // when
    final int result = solution.rob(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void rob_example2() {
    // given
    final int[] nums = {2, 7, 9, 3, 1};

    // expected
    final int expected = 12;

    // when
    final int result = solution.rob(nums);

    // then
    assertEquals(expected, result);
  }

  @Test
  void rob_example3() {
    // given
    final int[] nums = {2, 1, 1, 2};

    // expected
    final int expected = 4;

    // when
    final int result = solution.rob(nums);

    // then
    assertEquals(expected, result);
  }
}
