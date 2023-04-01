package com.leetcode.graph.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow_417_DFS implements PacificAtlanticWaterFlow_417 {

  @Override
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    final int rows = heights.length;
    final int cols = heights[0].length;
    boolean[][] pacific = new boolean[rows][cols];
    boolean[][] atlantic = new boolean[rows][cols];

    for (int i = 0; i < rows; i++) {
      dfs(heights, i, 0, pacific, heights[i][0]); // Pacific - left border
      dfs(heights, i, cols - 1, atlantic, heights[i][cols - 1]); // atlantic - right border
    }

    for (int j = 0; j < cols; j++) {
      dfs(heights, 0, j, pacific, heights[0][j]); // Pacific - top border
      dfs(heights, rows - 1, j, atlantic, heights[rows - 1][j]); // Atlantic - bottom border
    }

    final List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (pacific[i][j] && atlantic[i][j]) {
          result.add(Arrays.asList(i, j));
        }
      }
    }

    return result;
  }

  private void dfs(int[][] heights, int row, int col, boolean[][] visited, int prevHeight) {
    if (row < 0 || row == heights.length) {
      return;
    }
    if (col < 0 || col == heights[0].length) {
      return;
    }
    if (visited[row][col]) {
      return;
    }
    if (prevHeight > heights[row][col]) {
      return;
    }

    visited[row][col] = true;

    dfs(heights, row + 1, col, visited, heights[row][col]);
    dfs(heights, row - 1, col, visited, heights[row][col]);
    dfs(heights, row, col + 1, visited, heights[row][col]);
    dfs(heights, row, col - 1, visited, heights[row][col]);
  }
}
