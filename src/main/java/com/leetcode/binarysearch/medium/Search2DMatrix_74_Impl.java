package com.leetcode.binarysearch.medium;

public class Search2DMatrix_74_Impl implements Search2DMatrix_74 {

  @Override
  public boolean searchMatrix(final int[][] matrix, final int target) {
    int up = 0;
    int bottom = matrix.length - 1;
    final int lastElement = matrix[0].length - 1;

    while (up <= bottom) {
      int center = up + (bottom - up) / 2;
      if (matrix[center][0] <= target && matrix[center][lastElement] >= target) {
        // the row is found. let's use binary search in the row.
        int left = 0;
        int right = lastElement;

        while (left <= right) {
          int mid = left + (right - left) / 2;
          if (matrix[center][mid] == target) {
            return true;
          } else if (matrix[center][mid] > target) {
            right = mid - 1;
          } else {
            left = mid + 1;
          }
        }
        break;

      } else if (matrix[center][0] > target) {
        bottom = center - 1;
      } else {
        up = center + 1;
      }
    }

    return false;
  }
}
