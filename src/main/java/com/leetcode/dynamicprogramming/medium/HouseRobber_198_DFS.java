package com.leetcode.dynamicprogramming.medium;

import java.util.Arrays;

public class HouseRobber_198_DFS implements HouseRobber_198 {

  private static final int EMPTY_VALUE = -1;

  @Override
  public int rob(int[] nums) {
    final int[] memoization = new int[nums.length];
    Arrays.fill(memoization, EMPTY_VALUE);
    return solve(nums, 0, memoization);
  }

  public int solve(int[] nums, int i, int[] memoization) {
    if (i >= nums.length) {
      return 0;
    }

    if (memoization[i] != EMPTY_VALUE) {
      return memoization[i];
    }

    return memoization[i] = Math.max(
        nums[i] + solve(nums, i + 2, memoization),
        solve(nums, i + 1, memoization)
    );
  }
}
