package com.leetcode.dynamicprogramming.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PartitionEqualSubsetSum_416Test {

  private final PartitionEqualSubsetSum_416 solution = new PartitionEqualSubsetSum_416_3_Knapsack();

  @Test
  void canPartition_example1() {
    // given
    final int[] nums = {1, 5, 11, 5};

    // when
    final boolean result = solution.canPartition(nums);

    // then
    assertTrue(result);
  }

  @Test
  void canPartition_example2() {
    // given
    final int[] nums = {1, 2, 3, 5};

    // when
    final boolean result = solution.canPartition(nums);

    // then
    assertFalse(result);
  }

  @Test
  void canPartition_example3() {
    // given
    final int[] nums = {23, 13, 11, 7, 6, 5, 5};

    // when
    final boolean result = solution.canPartition(nums);

    // then
    assertTrue(result);
  }

  @Test
  void canPartition_example4() {
    // given
    final int[] nums = {100, 100, 100, 100, 100, 100, 100, 100};

    // when
    final boolean result = solution.canPartition(nums);

    // then
    assertTrue(result);
  }

  @Test
  void canPartition_timeout() {
    // given
    final int[] nums = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
        100, 100, 100, 99, 97};

    // when
    Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      final boolean result = solution.canPartition(nums);
      // then
      assertFalse(result);
    });
  }
}
