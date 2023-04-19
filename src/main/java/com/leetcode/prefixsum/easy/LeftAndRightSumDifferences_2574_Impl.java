package com.leetcode.prefixsum.easy;

public class LeftAndRightSumDifferences_2574_Impl implements LeftAndRightSumDifferences_2574 {

  @Override
  public int[] leftRigthDifference(final int[] nums) {
    int rightSum = 0;
    for (final int num : nums) {
      rightSum += num;
    }

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      rightSum -= nums[i];
      int tmp = nums[i];
      nums[i] = Math.abs(leftSum - rightSum);
      leftSum += tmp;
    }

    return nums;
  }
}
