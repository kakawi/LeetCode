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

      // check if `mid` belongs to the left or the right sorted sub array
      if (nums[left] <= nums[mid]) { // == for the case when `left == mid`
        // I know that left side is sorted
        // So if `target` is inside the left side, then use the standard approach
        if (nums[left] <= target && target < nums[mid]) {
          right = mid - 1;
        } else {
          // otherwise
          left = mid + 1;
        }
      } else {
        // I know that the right side is sorted
        // So if `target` is inside the right side, then use the standard approach
        if (nums[mid] < target && target <= nums[right]) {
          left = mid + 1;
        } else {
          // otherwise
          right = mid - 1;
        }
      }
    }

    return -1;
  }
}
