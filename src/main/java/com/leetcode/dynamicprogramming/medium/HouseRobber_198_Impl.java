package com.leetcode.dynamicprogramming.medium;

public class HouseRobber_198_Impl implements HouseRobber_198 {

  @Override
  public int rob(final int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    // 2nd house is a unique case
    nums[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
      nums[i] = Math.max(nums[i - 2] + nums[i], nums[i - 1]);
    }

    return nums[nums.length - 1];
  }
}
