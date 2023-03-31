package com.leetcode.binarysearch.medium;

public class SearchInRotatedSortedArray_33_Impl implements SearchInRotatedSortedArray_33 {

  @Override
  public int search(final int[] nums, final int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      // check if Mid is in the left sorted subarray
      if (nums[left] <= nums[mid]) {
        // check if Target is in the left sorted subarray
        if (target <= nums[mid] && target >= nums[left]) {
          // standard approach
          right = mid - 1;
        } else {
          // just move left border
          left = mid + 1;
        }
      } else {
        // check if Target in the right sorted subarray
        if (target >= nums[mid] && target <= nums[right]) {
          // standard approach
          left = mid + 1;
        } else {
          // just move right border
          right = mid - 1;
        }
      }
    }

    return -1;
  }
}
