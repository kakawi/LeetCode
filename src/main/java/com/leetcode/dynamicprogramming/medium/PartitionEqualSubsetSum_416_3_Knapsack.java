package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Modifying Knapsack problem
 */
public class PartitionEqualSubsetSum_416_3_Knapsack implements PartitionEqualSubsetSum_416 {

  @Override
  public boolean canPartition(final int[] nums) {
    final int totalSum = Arrays.stream(nums).reduce(0, Integer::sum);
    if (totalSum % 2 != 0) {
      return false;
    }

    final int target = totalSum / 2;

    // create matrix
    final boolean[][] matrix = new boolean[nums.length + 1][target + 1];
    matrix[0][0] = true;

    // here i = 1 'cas everything other column (sum) of this row cannot be created with 0 elements
    for (int i = 1; i <= nums.length; i++) {
      for (int j = 0; j <= target; j++) {
        if (j - nums[i - 1] >= 0) {
          matrix[i][j] = matrix[i - 1][j - nums[i - 1]] || matrix[i - 1][j];
        } else {
          // just using the previous value
          matrix[i][j] = matrix[i - 1][j];
        }
      }
    }

    return matrix[nums.length][target];
  }
}
