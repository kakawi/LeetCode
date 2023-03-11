package com.leetcode.graph.medium;

public class Number_of_Islands_200 {

  public static void main(String[] args) {
    final Number_of_Islands_200 solution = new Number_of_Islands_200();
  }

  public int numIslands(char[][] grid) {
    final int rows = grid.length;
    final int columns = grid[0].length;

    int counter = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          counter++;
        }
      }
    }
    return counter;
  }

  private void dfs(final char[][] grid, final int i, final int j) {
    final int rows = grid.length;
    final int columns = grid[0].length;

    if (i < 0 || i == rows || j < 0 || j == columns) {
      return;
    }

    if (grid[i][j] != '1') {
      return;
    }
    grid[i][j] = 'v';
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
  }
}
