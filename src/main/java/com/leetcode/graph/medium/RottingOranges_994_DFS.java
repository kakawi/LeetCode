package com.leetcode.graph.medium;

public class RottingOranges_994_DFS implements RottingOranges_994 {

  // Instead of using a separate value to store results we can use Grid cells to store it
  // But we can not use 0, 1, 2 - because this is meaningful digits
  private static final int BUFFER = 2;

  @Override
  public int orangesRotting(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return -1;
    }

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 2) {
          rotAdjacent(grid, i, j, BUFFER);
        }
      }
    }

    int minutes = BUFFER;
    for (int[] row : grid) {
      for (int cell : row) {
        if (cell == 1) {
          return -1;
        }
        minutes = Math.max(minutes, cell);
      }
    }

    return minutes - BUFFER;
  }

  private void rotAdjacent(int[][] grid, int row, int column, int minutes) {
    if (row < 0 || row == grid.length) {
      return;
    }
    if (column < 0 || column == grid[0].length) {
      return;
    }
    if (grid[row][column] == 0) {
      return;
    }
    /* this orange is rotten FASTER by another rotten orange */
    if (grid[row][column] > 1 && grid[row][column] < minutes) {
      return;
    }
    grid[row][column] = minutes;
    rotAdjacent(grid, row - 1, column, minutes + 1);
    rotAdjacent(grid, row + 1, column, minutes + 1);
    rotAdjacent(grid, row, column - 1, minutes + 1);
    rotAdjacent(grid, row, column + 1, minutes + 1);
  }
}
