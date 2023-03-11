package com.leetcode.prefixsum.easy;

/**
 * Solution:
 * 1. One loop to sum all elements => rightSum
 * 2. Second loop rightSum - currentElement; leftSum + currentElement
 */
public class Left_and_Right_Sum_Differences_2574 {

  public static void main(String[] args) {
    Left_and_Right_Sum_Differences_2574 solution = new Left_and_Right_Sum_Differences_2574();
    solution.leftRightDifference2(new int[]{10, 4, 8, 3});
    solution.leftRightDifference2(new int[]{1});
  }

  public int[] leftRightDifference(int[] nums) {
    final int length = nums.length;
    if (length == 1) {
      return new int[]{0};
    }

    int[] leftSum = new int[length];
    int[] rightSum = new int[length];
    int[] result = new int[length];
    leftSum[0] = 0;
    rightSum[length - 1] = 0;

    for (int i = 1; i < length; i++) {
      leftSum[i] = leftSum[i - 1] + nums[i - 1];
      rightSum[length - 1 - i] = rightSum[length - i] + nums[length - i];
    }
    for (int i = 0; i < length; i++) {
      result[i] = Math.abs(leftSum[i] - rightSum[i]);
    }
    return result;
  }

  /**
   * Simple total sum & partial sum - O(n) time & O(1) space
   */
  public int[] leftRightDifference2(int[] nums) {
    int rightSum = 0, leftSum = 0;

    for (final int num : nums) {
      rightSum += num;
    }

    for (int i = 0; i < nums.length; i++) {
      final int tmp = nums[i];
      leftSum += tmp;
      nums[i] = Math.abs(rightSum - leftSum);
      rightSum -= tmp;
    }

    return nums;
  }

}
