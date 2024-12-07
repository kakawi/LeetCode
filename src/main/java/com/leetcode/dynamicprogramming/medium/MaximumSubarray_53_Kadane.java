package com.leetcode.dynamicprogramming.medium;

public class MaximumSubarray_53_Kadane implements MaximumSubarray_53 {
  public int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int num : nums) {
      if (currentSum < 0) {
        currentSum = 0;
      }
      currentSum += num;
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
}
