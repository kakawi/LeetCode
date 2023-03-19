package com.leetcode.binarysearch.easy;

public class BinarySearch_704_Impl implements BinarySearch_704 {

  @Override
  public int search(int[] nums, int target) {
    int leftBorder = 0;
    int rightBorder = nums.length - 1;

    while (leftBorder <= rightBorder) {
      int mid = (rightBorder + leftBorder) / 2;
      if (nums[mid] < target) {
        leftBorder = mid + 1;
      } else if (nums[mid] > target) {
        rightBorder = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
