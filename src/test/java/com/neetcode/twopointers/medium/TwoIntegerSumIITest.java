package com.neetcode.twopointers.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoIntegerSumIITest {
  private final TwoIntegerSumII solution = new TwoIntegerSumII_Impl();

  @Test
  void example1() {
    // given
    int[] numbers = { 1, 2, 3, 4 };
    int target = 3;

    // expected
    int[] expected = { 1, 2 };

    // when
    int[] result = solution.twoSum(numbers, target);

    // then
    assertArrayEquals(expected, result);
  }
}
