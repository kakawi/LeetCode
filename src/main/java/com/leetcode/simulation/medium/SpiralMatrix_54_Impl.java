package com.leetcode.simulation.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54_Impl implements SpiralMatrix_54 {

  @Override
  public List<Integer> spiralOrder(final int[][] matrix) {
    final List<Integer> result = new ArrayList<>();

    int up = 0;
    int bottom = matrix.length;
    int left = 0;
    int right = matrix[0].length;

    // Because matrix can be any form we have to add check after every line
    while (true) {
      // up
      for (int i = left; i < right; i++) {
        result.add(matrix[up][i]);
      }
      up++;
      if (up == bottom) break;

      // right
      for (int i = up; i < bottom; i++) {
        result.add(matrix[i][right - 1]);
      }
      right--;
      if (right == left) break;

      // bottom
      for (int i = right - 1; i >= left; i--) {
        result.add(matrix[bottom - 1][i]);
      }
      bottom--;
      if (bottom == up) break;

      // left
      for (int i = bottom - 1; i >= up; i--) {
        result.add(matrix[i][left]);
      }
      left++;
      if (left == right) break;
    }

    return result;
  }
}
