package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Because Knapsack approach uses a matrix, we can reduce to 1 row. Just calculate from right ->
 * left
 */
public class PartitionEqualSubsetSum_416_4_Knapsack_1Array implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = Arrays.stream(nums).reduce(0, Integer::sum);
    if (totalSum % 2 != 0) {
      return false;
    }

    final int target = totalSum / 2;

    // using just 1 row
    final boolean[] row = new boolean[target + 1];
    row[0] = true;

    for (int i = 1; i <= nums.length; i++) {
      for (int j = target; j > 0; j--) {
        if (j - nums[i - 1] >= 0) {
          row[j] = row[j - nums[i - 1]] || row[j];
        }
      }
    }

    return row[target];
  }
}
