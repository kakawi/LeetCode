package com.leetcode.graph.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges_994_BFS implements RottingOranges_994 {

  @Override
  public int orangesRotting(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    final Queue<int[]> queue = new LinkedList<>();
    int countFreshOrange = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 2) {
          queue.offer(new int[]{i, j});
        }
        if (grid[i][j] == 1) {
          countFreshOrange++;
        }
      }
    }
    if (countFreshOrange == 0) {
      return 0;
    }
    if (queue.isEmpty()) {
      return -1;
    }

    int minutes = -1;
    int[][] dirs = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size-- > 0) {
        int[] cell = queue.poll();
        int x = cell[0];
        int y = cell[1];
        for (int[] dir : dirs) {
          int i = x + dir[0];
          int j = y + dir[1];
          if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
            grid[i][j] = 2;
            countFreshOrange--;
            queue.offer(new int[]{i, j});
          }
        }
      }
      minutes++;
    }

    if (countFreshOrange == 0) {
      return minutes;
    }
    return -1;
  }
}
