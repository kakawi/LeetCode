package com.leetcode.dynamicprogramming.medium;

public class UniquePaths_62_Array implements UniquePaths_62 {

  @Override
  public int uniquePaths(final int m, final int n) {
    int[] array = new int[n];
    array[0] = 1; // initial value
    for (int i = 0; i < m; i++) {
      for (int j = 1; j < n; j++) {
        array[j] += array[j - 1];
      }
    }

    return array[n - 1];
  }
}
