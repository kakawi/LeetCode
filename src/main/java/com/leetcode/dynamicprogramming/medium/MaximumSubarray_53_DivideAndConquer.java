package com.leetcode.dynamicprogramming.medium;

public class MaximumSubarray_53_DivideAndConquer implements MaximumSubarray_53 {
  public int maxSubArray(int[] nums) {
    return dfs(nums, 0, nums.length - 1);
  }

  private int dfs(int[] nums, int l, int r) {
    if (l > r) {
      return Integer.MIN_VALUE;
    }
    int m = (l + r) >> 1;
    int leftSum = 0, rightSum = 0, currentSum = 0;
    for (int i = m - 1; i >= l; i--) {
      currentSum += nums[i];
      leftSum = Math.max(leftSum, currentSum);
    }

    currentSum = 0;
    for (int i = m + 1; i <= r; i++) {
      currentSum += nums[i];
      rightSum = Math.max(rightSum, currentSum);
    }

    return Math.max(dfs(nums, l, m - 1),
        Math.max(dfs(nums, m + 1, r),
            leftSum + nums[m] + rightSum));
  }
}
