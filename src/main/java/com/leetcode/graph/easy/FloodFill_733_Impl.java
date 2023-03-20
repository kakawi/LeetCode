package com.leetcode.graph.easy;

public class FloodFill_733_Impl implements FloodFill_733 {

  @Override
  public int[][] floodFill(final int[][] image, final int sr, final int sc, final int newColor) {
    final int initColor = image[sr][sc];
    if (initColor == newColor) {
      return image;
    }

    changeColor(image, sr, sc, initColor, newColor);

    return image;
  }

  private void changeColor(final int[][] image, final int row, final int column, final int initColor,
      final int newColor) {
    if (row < 0 || row == image.length) return;
    if (column < 0 || column == image[0].length) return;
    if (image[row][column] != initColor) return;

    image[row][column] = newColor;

    changeColor(image, row - 1, column, initColor, newColor);
    changeColor(image, row + 1, column, initColor, newColor);
    changeColor(image, row, column - 1, initColor, newColor);
    changeColor(image, row, column + 1, initColor, newColor);
  }
}
