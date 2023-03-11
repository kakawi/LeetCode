package com.leetcode.prefixsum.easy;

public class FindPivotIndex_724_Impl implements FindPivotIndex_724 {

  @Override
  public int pivotIndex(final int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int totalSum = 0; // It is a optimizations that substitutes `prefix sum array`
    for (final int num : nums) {
      totalSum += num;
    }

    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      int rightSum = totalSum - leftSum - nums[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += nums[i];
    }

    return -1;
  }
}
