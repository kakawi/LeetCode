package com.leetcode.dynamicprogramming.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionEqualSubsetSum_416_1_BruteForce implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = Arrays.stream(nums).reduce(0, Integer::sum);
    if (totalSum % 2 != 0) return false;

    final int target = totalSum / 2;
    final Set<Integer> memo = new HashSet<>();
    memo.add(0);

    for (final int number : nums) {
      final List<Integer> possibleSums = new ArrayList<>(memo);
      for (final Integer possibleSum : possibleSums) {
        memo.add(possibleSum + number);
      }
    }

    return memo.contains(target);
  }
}
