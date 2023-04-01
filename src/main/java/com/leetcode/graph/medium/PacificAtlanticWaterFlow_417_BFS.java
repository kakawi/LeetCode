package com.leetcode.graph.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow_417_BFS implements PacificAtlanticWaterFlow_417 {

  private final int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  @Override
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int m = heights.length, n = heights[0].length;

    final boolean[][] pacific = new boolean[m][n];
    final boolean[][] atlantic = new boolean[m][n];

    final Queue<int[]> pacificQueue = new ArrayDeque<>();
    final Queue<int[]> atlanticQueue = new ArrayDeque<>();

    for (int i = 0; i < m; i++) {
      pacificQueue.offer(new int[]{i, 0});
      pacific[i][0] = true;
      atlanticQueue.offer(new int[]{i, n - 1});
      atlantic[i][n - 1] = true;
    }

    for (int i = 0; i < n; i++) {
      pacificQueue.offer(new int[]{0, i});
      pacific[0][i] = true;
      atlanticQueue.offer(new int[]{m - 1, i});
      atlantic[m - 1][i] = true;
    }

    bfs(heights, pacificQueue, pacific);
    bfs(heights, atlanticQueue, atlantic);

    final List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (pacific[i][j] && atlantic[i][j]) {
          result.add(Arrays.asList(i, j));
        }
      }
    }

    return result;
  }

  private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
    int m = heights.length, n = heights[0].length;
    while (!queue.isEmpty()) {
      int[] pos = queue.poll();
      for (int[] dir : dirs) {
        int x = pos[0] + dir[0];
        int y = pos[1] + dir[1];
        if (
            (x < 0 || x >= m)
                || (y < 0 || y >= n)
                || visited[x][y]
                || heights[x][y] < heights[pos[0]][pos[1]]
        ) {
          continue;
        }

        visited[x][y] = true;
        queue.offer(new int[]{x, y});
      }
    }
  }
}
