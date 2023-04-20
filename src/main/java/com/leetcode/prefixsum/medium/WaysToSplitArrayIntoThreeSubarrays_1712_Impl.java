package com.leetcode.prefixsum.medium;

public class WaysToSplitArrayIntoThreeSubarrays_1712_Impl implements
    WaysToSplitArrayIntoThreeSubarrays_1712 {

  @Override
  public int waysToSplit(final int[] nums) {
    int result = 0;
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
    int leftBorder = 0;
    int rightBorder = 0;
    final int totalSum = nums[nums.length - 1];
    // using loop to change `leftSum`
    // `midSum` and `rightSum` will be calculated inside the loop
    for (int i = 0; i < nums.length - 2; i++) {
      final int leftSum = nums[i];
      if (3 * leftSum > totalSum) { // Optimization
        break;
      }
      leftBorder = Math.max(leftBorder, i + 1);
      // find the closest `LeftBorder` that satisfies condition (leftSum < midSum)
      while (leftBorder < nums.length - 1 && leftSum > nums[leftBorder] - leftSum) {
        leftBorder++;
      }
      rightBorder = Math.max(rightBorder, leftBorder);
      // Find the farthest `RightBorder` that satisfies condition (midSum <= rightSum)
      while (rightBorder < nums.length - 1
          && nums[rightBorder] - leftSum <= totalSum - nums[rightBorder]) {
        rightBorder++;
      }
      // it means that everything between `LeftBorder` and `RightBorder` is valid cases
      result = (result + rightBorder - leftBorder) % 1000000007;
    }
    return result;
  }
}
