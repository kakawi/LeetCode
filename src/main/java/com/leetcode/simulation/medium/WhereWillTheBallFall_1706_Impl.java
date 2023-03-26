package com.leetcode.simulation.medium;

public class WhereWillTheBallFall_1706_Impl implements WhereWillTheBallFall_1706 {

  @Override
  public int[] findBall(int[][] grid) {
    final int[] result = new int[grid[0].length];

    for (int i = 0; i < grid[0].length; i++) {
      result[i] = dfs(0, i, grid);
    }

    return result;
  }

  private int dfs(final int row, final int column, final int[][] grid) {
    if (row == grid.length) {
      return column;
    }

    int nextColumn = column + grid[row][column];

    if (nextColumn < 0 || nextColumn == grid[0].length || grid[row][column] != grid[row][nextColumn]) {
      return -1;
    }

    return dfs(row + 1, nextColumn, grid);
  }
}
