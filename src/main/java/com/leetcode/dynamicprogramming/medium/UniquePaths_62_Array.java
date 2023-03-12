package com.leetcode.dynamicprogramming.medium;

public class UniquePaths_62_Array implements UniquePaths_62 {

  @Override
  public int uniquePaths(final int m, final int n) {
    int[] row = new int[n];
    for (int j = 0; j < n; j++) {
      row[j] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        row[j] += row[j - 1];
      }
    }

    return row[n - 1];
  }
}
