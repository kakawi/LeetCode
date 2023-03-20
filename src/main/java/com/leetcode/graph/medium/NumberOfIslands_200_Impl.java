package com.leetcode.graph.medium;

public class NumberOfIslands_200_Impl implements
    NumberOfIslands_200 {

  @Override
  public int numIslands(final char[][] grid) {
    int islands = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          islands++;
          markIsland(grid, i, j);
        }
      }
    }

    return islands;
  }

  private void markIsland(char[][] grid, int row, int column) {
    if (row < 0 || row == grid.length) return;
    if (column < 0 || column == grid[0].length) return;
    if (grid[row][column] != '1') return;

    grid[row][column] = 'v';
    markIsland(grid, row - 1, column);
    markIsland(grid, row + 1, column);
    markIsland(grid, row, column - 1);
    markIsland(grid, row, column + 1);
  }
}
