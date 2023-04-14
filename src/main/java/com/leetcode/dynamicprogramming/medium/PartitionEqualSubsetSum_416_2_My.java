package com.leetcode.dynamicprogramming.medium;

/**
 * Similar to DfsWithBackTracking, but simpler
 */
public class PartitionEqualSubsetSum_416_2_My implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = getTotalSum(nums);
    if (totalSum % 2 != 0) {
      return false;
    }
    final int target = totalSum / 2;

    return solve(nums, 0, target);
  }

  private boolean solve(final int[] nums, final int nextIndex, final int target) {
    if (target < 0 || nextIndex == nums.length) return false;
    if (target == 0) return true;

    return solve(nums, nextIndex + 1, target - nums[nextIndex])
        || solve(nums, nextIndex + 1, target);
  }

  private int getTotalSum(final int[] nums) {
    int result = 0;
    for (final int num : nums) {
      result += num;
    }
    return result;
  }
}
