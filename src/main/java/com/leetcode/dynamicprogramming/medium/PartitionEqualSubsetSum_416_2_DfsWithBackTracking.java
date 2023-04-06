package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Result: Timeout
 * Idea: build Binary Tree that represent all combinations of sums
 */
public class PartitionEqualSubsetSum_416_2_DfsWithBackTracking implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = Arrays.stream(nums).reduce(0, Integer::sum);
    if (totalSum % 2 != 0) {
      return false;
    }
    final int target = totalSum / 2;

    return backtracking(0, 0, nums, target);
  }

  private boolean backtracking(final int currentSum, final int index, final int[] nums,
      final int target) {
    // if our Sum is bigger than my target there's no reason to continue expanding
    if (currentSum > target || index >= nums.length) {
      return false;
    }
    // when I reach my target, return true
    if (currentSum == target) {
      return true;
    }

    return backtracking(currentSum + nums[index], index + 1, nums, target)
        || backtracking(currentSum, index + 1, nums, target);
  }
}
