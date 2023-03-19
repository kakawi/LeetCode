package com.leetcode.binarysearch.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearch_704Test {

  private final BinarySearch_704 solution = new BinarySearch_704_Impl();

  @Test
  void search_example1() {
    // given
    final int[] nums = {-1, 0, 3, 5, 9, 12};
    final int target = 9;

    // expected
    final int expected = 4;

    // when
    final int result = solution.search(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void search_example2() {
    // given
    final int[] nums = {-1, 0, 3, 5, 9, 12};
    final int target = 2;

    // expected
    final int expected = -1;

    // when
    final int result = solution.search(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void search_oneElement() {
    // given
    final int[] nums = {5};
    final int target = 5;

    // expected
    final int expected = 0;

    // when
    final int result = solution.search(nums, target);

    // then
    assertEquals(expected, result);
  }
}
