package com.neetcode.arraysandhashing.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

  private final ContainsDuplicate solution = new ContainsDuplicate_Impl();

  @Test
  void example1() {
    // given
    final int[] nums = { 1, 2, 3, 3 };

    // when
    final Boolean result = solution.hasDuplicate(nums);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    final int[] nums = { 1, 2, 3, 4 };

    // when
    final Boolean result = solution.hasDuplicate(nums);

    // then
    assertFalse(result);
  }
}
