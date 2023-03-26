package com.leetcode.simulation.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54_Impl implements SpiralMatrix_54 {

  @Override
  public List<Integer> spiralOrder(final int[][] matrix) {
    final List<Integer> result = new ArrayList<>();

    final int rows = matrix.length;
    final int columns = matrix[0].length;
    final int matrixSize = rows * columns;

    int up = 0;
    int down = rows - 1;
    int left = 0;
    int right = columns - 1;

    while (result.size() != matrixSize) {
      for (int i = left; i <= right; i++) {
        result.add(matrix[up][i]);
      }
      up++;
      for (int i = up; i <= down; i++) {
        result.add(matrix[i][right]);
      }
      right--;

      if (up > down) break;
      for (int i = right; i >= left; i--) {
        result.add(matrix[down][i]);
      }
      down--;
      if (left > right) break;
      for (int i = down; i >= up; i--) {
        result.add(matrix[i][left]);
      }
      left++;
    }

    return result;
  }
}
