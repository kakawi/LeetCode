package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TopKElementsInListTest {
  private final TopKElementsInList solution = new TopKElementsInList_Impl();

  @Test
  void example1() {
    // given
    int[] nums = { 1, 2, 2, 3, 3, 3 };
    int target = 2;

    // expected
    int[] expected = { 2, 3 };

    // when
    int[] result = solution.topKFrequent(nums, target);

    // then
    Arrays.sort(expected);
    Arrays.sort(result);
    assertArrayEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] nums = { 7, 7 };
    int target = 1;

    // expected
    int[] expected = { 7 };

    // when
    int[] result = solution.topKFrequent(nums, target);

    // then
    Arrays.sort(expected);
    Arrays.sort(result);
    assertArrayEquals(expected, result);
  }
}
