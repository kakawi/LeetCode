package com.leetcode.dynamicprogramming.medium;

public class MaximumProductSubarray_152_MinMax implements MaximumProductSubarray_152 {

  @Override
  public int maxProduct(final int[] nums) {
    int answer = nums[0];
    int min = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; ++i) {
      // Swapping min and max
      if (nums[i] < 0) {
        final int temp = max;
        max = min;
        min = temp;
      }

      max = Math.max(nums[i], max * nums[i]);
      min = Math.min(nums[i], min * nums[i]);

      answer = Math.max(answer, max);
    }
    return answer;
  }
}
