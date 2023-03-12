package com.leetcode.hashmap.easy;

import com.leetcode.hashmap.easy.TwoSum_1;

public class TwoSum_1_BruteForce implements TwoSum_1 {

  @Override
  public int[] twoSum(final int[] nums, final int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      final int firstNumber = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        final int secondNumber = nums[j];
        if (firstNumber + secondNumber == target) {
          return new int[]{i, j};
        }
      }
    }

    throw new IllegalStateException("The solution is guaranteed");
  }
}
