package com.leetcode.prefixsum.easy;

public class FindPivotIndex_724_Impl implements FindPivotIndex_724 {

  @Override
  public int pivotIndex(final int[] nums) {
    int rightSum = 0;
    for (final int num : nums) {
      rightSum += num;
    }

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += nums[i];
    }

    return -1;
  }
}
