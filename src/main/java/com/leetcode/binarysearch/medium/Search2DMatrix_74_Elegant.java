package com.leetcode.binarysearch.medium;

public class Search2DMatrix_74_Elegant implements Search2DMatrix_74 {

  @Override
  public boolean searchMatrix(final int[][] matrix, final int target) {
    int row = 0;
    int column = matrix[0].length - 1;

    while (row < matrix.length && column >= 0) {
      if (matrix[row][column] == target) {
        return true;
      } else if (matrix[row][column] > target) {
        column--;
      } else {
        row++;
      }
    }

    return false;
  }
}
