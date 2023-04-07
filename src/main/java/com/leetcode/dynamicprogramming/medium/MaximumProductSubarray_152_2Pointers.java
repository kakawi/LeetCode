package com.leetcode.dynamicprogramming.medium;

public class MaximumProductSubarray_152_2Pointers implements MaximumProductSubarray_152 {

  @Override
  public int maxProduct(final int[] nums) {
    int n = nums.length;
    int left = 1, right = 1;
    int answer = nums[0];

    for (int i = 0; i < n; i++) {

      //if any of left or right become 0 then update it to 1
      left = left == 0 ? 1 : left;
      right = right == 0 ? 1 : right;

      left *= nums[i]; //prefix product
      right *= nums[n - 1 - i]; //suffix product

      answer = Math.max(answer, Math.max(left, right));
    }

    return answer;
  }
}
