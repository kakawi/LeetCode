package com.neetcode.twopointers.medium;

public class TwoIntegerSumII_Impl implements TwoIntegerSumII {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      int leftNumber = numbers[left];
      int rightNumber = numbers[right];
      int sum = leftNumber + rightNumber;
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      } else {
        return new int[] { left + 1, right + 1 };
      }
    }
    throw new IllegalArgumentException("No solution found");
  }
}
