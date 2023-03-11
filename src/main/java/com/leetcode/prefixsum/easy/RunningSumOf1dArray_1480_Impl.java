package com.leetcode.prefixsum.easy;

public class RunningSumOf1dArray_1480_Impl implements RunningSumOf1dArray_1480 {

  @Override
  public int[] runningSum(final int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    return nums;
  }
}
