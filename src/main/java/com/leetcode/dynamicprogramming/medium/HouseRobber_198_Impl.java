package com.leetcode.dynamicprogramming.medium;

/**
 * If there are just 5 houses the algorithm is following:
 * Starting from 3rd house we have to choose what is bigger
 * - 1st
 * - 1st OR 2sd
 * - 3rd house + 1st OR (1st or 2nd)
 * - 4th house + 2nd OR 3rd + 1st
 * - 5th house + 3rd + 1st OR 4th + 2nd
 * ...
 */
public class HouseRobber_198_Impl implements HouseRobber_198 {

  @Override
  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }

    // maxProfit[i] = the maximum amount of money that can rob to the i-th house
    int[] maxProfit = new int[nums.length];
    maxProfit[0] = nums[0];
    maxProfit[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < maxProfit.length; i++) {
      // maxProfit[i-2] because don't want to trigger the police
      maxProfit[i] = Math.max(nums[i] + maxProfit[i - 2], maxProfit[i - 1]);
    }

    return maxProfit[nums.length - 1];
  }
}
