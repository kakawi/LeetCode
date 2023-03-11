package com.leetcode.binarysearch.easy;

public class Binary_Search_704 {

  public static void main(String[] args) {
    final Binary_Search_704 solution = new Binary_Search_704();
    solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
  }

  public int search(int[] nums, int target) {
    int leftBorder = 0;
    int rightBorder = nums.length - 1;

    while (leftBorder <= rightBorder) {
      int mid = (rightBorder + leftBorder) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        rightBorder = mid - 1;
      } else {
        leftBorder = mid + 1;
      }
    }
    return -1;
  }
}
