package com.leetcode.dynamicprogramming.medium;

public class HouseRobber_198_DFS implements HouseRobber_198 {

  @Override
  public int rob(int[] nums) {
    int[] maxProfit = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      maxProfit[i] = -1;
    }
    return solve(nums, 0, maxProfit);
  }

  public int solve(int[] nums, int i, int[] protif) {
    if (i >= nums.length) {
      return 0;
    } else {
      if (protif[i] != -1) {
        return protif[i];
      }
      return protif[i] = Math.max(nums[i] + solve(nums, i + 2, protif), solve(nums, i + 1, protif));
    }
  }
}
