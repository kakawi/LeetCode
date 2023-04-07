package com.leetcode.slidingwindow.medium;

import java.util.Arrays;

/**
 * Solution: 3 Pointers
 */
public class ThreeSumClosest_16_Impl implements ThreeSumClosest_16 {

  @Override
  public int threeSumClosest(final int[] nums, final int target) {
    Arrays.sort(nums); // Sort the array to enable two-pointer approach
    int minDiff = Integer.MAX_VALUE; // Initialize minimum difference to a large value
    int closestSum = Integer.MAX_VALUE; // Initialize minimum difference to a large value

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        final int sum = nums[i] + nums[left] + nums[right];

        final int diff = Math.abs(sum - target);
        if (diff < minDiff) {
          minDiff = diff;
          closestSum = sum;
        }

        if (sum < target) {
          left++; // If current sum is less than target, increment the left pointer
        } else if (sum > target) {
          right--; // If current sum is greater than target, decrement the right pointer
        } else {
          return sum; // If current sum is equal to target, return it as the closest sum
        }
      }
    }

    return closestSum;
  }
}
