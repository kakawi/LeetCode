package com.leetcode.binarysearch.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArray_33Test {

  private final SearchInRotatedSortedArray_33 solution = new SearchInRotatedSortedArray_33_Impl();

  @Test
  void search_example1() {
    // given
    final int[] nums = {4, 5, 6, 7, 0, 1, 2};
    final int target = 0;

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
    final int[] nums = {4, 5, 6, 7, 0, 1, 2};
    final int target = 3;

    // expected
    final int expected = -1;

    // when
    final int result = solution.search(nums, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void search_example3() {
    // given
    final int[] nums = {1};
    final int target = 0;

    // expected
    final int expected = -1;

    // when
    final int result = solution.search(nums, target);

    // then
    assertEquals(expected, result);
  }
}
