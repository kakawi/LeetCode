package com.leetcode.graph.easy;

public class Flood_Fill_733 {

  public static void main(String[] args) {
    final Flood_Fill_733 solution = new Flood_Fill_733();
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    final int oldColor = image[sr][sc];
    if (oldColor == newColor) {
      return image;
    }
    dfs(image, sr, sc, oldColor, newColor);
    return image;
  }

  private void dfs(final int[][] image, final int sr, final int sc, final int oldColor, final int newColor) {
    if (sr < 0 || sr == image.length || sc < 0 || sc == image[0].length) {
      return;
    }
    if (image[sr][sc] != oldColor) {
      return;
    }
    image[sr][sc] = newColor;
    dfs(image, sr + 1, sc, oldColor, newColor);
    dfs(image, sr - 1, sc, oldColor, newColor);
    dfs(image, sr, sc + 1, oldColor, newColor);
    dfs(image, sr, sc - 1, oldColor, newColor);
  }
}
