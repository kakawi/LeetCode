package com.hlebon.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

class Point {
  public int x;
  public int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static Point of(int x, int y) {
    return new Point(x, y);
  }
}

class Rectangle {
  private final char symbol;
  private final boolean[][] erased;
  private final Point initCoordinates;

  public Rectangle(char symbol, Point initCoordinates, Point rightBottomPoint) {
    this.symbol = symbol;
    this.initCoordinates = initCoordinates;
    int top = initCoordinates.y;
    int bottom = rightBottomPoint.y;
    int left = initCoordinates.x;
    int right = rightBottomPoint.x;

    int height = bottom - top + 1;
    int width = right - left + 1;
    erased = new boolean[height][width];
  }

  public boolean doesExist(Point point) {
    if (point.x < initCoordinates.x || point.y < initCoordinates.y) {
      return false;
    }
    int row = point.y - initCoordinates.y;
    int column = point.x - initCoordinates.x;
    return erased[row][column] == false;
  }

  public void erase(Point topLeft, Point bottomRight) {
    if (bottomRight.x < initCoordinates.x || bottomRight.y < initCoordinates.y) {
      return;
    }
    int left = topLeft.x < initCoordinates.x ? 0 : topLeft.x - initCoordinates.x;
    int top = topLeft.y < initCoordinates.y ? 0 : topLeft.y - initCoordinates.y;

    int bottom = bottomRight.y - initCoordinates.y;
    int right = bottomRight.x - initCoordinates.x;
    if (bottom >= erased.length) {
      bottom = erased.length - 1;
    }
    if (right >= erased[0].length) {
      right = erased[0].length;
    }

    for (int i = top; i <= bottom; i++) {
      for (int j = left; j <= right; j++) {
        erased[i][j] = true;
      }
    }
  }

  public void dragAndDrop(Point select, Point release) {
    int left = release.x - select.x;
    int bottom = release.y - select.y;

    initCoordinates.x += left;
    initCoordinates.y += bottom;
  }

  public void fill(char[][] board) {
    int columns = erased[0].length;
    int left = initCoordinates.x;
    int top = initCoordinates.y;
    for (int row = 0; row < erased.length; row++) {
      if (top + row >= board.length) {
        break;
      }
      for (int column = 0; column < columns; column++) {
        if (left + column >= board[0].length) {
          break;
        }
        if (erased[row][column]) {
          continue;
        }
        board[top + row][left + column] = symbol;
      }
    }
  }
}

/**
 * Thoughts:
 * - I have to save all rectanges as separate layer, because it can be moved and
 * brought to the front
 * - I choose that I would calculate what rectangle is first, I will print all
 * of them
 * Questions:
 * - Out of borders rectanges?
 * - Impossible coordinates?
 * - What to do if it was moved out of border?
 * - Limits of rectanges?
 * - Do I need to cover with Unit Tests?
 */
public class B {
  private final LinkedList<Rectangle> rectangles = new LinkedList<>();

  public void drawRectangle(char c, int leftX, int topY, int rightX, int bottomY) {
    var rectangle = new Rectangle(c, Point.of(leftX, topY), Point.of(rightX, bottomY));
    rectangles.offerFirst(rectangle);
  }

  public void eraseErea(int leftX, int topY, int rightX, int bottomY) {
    for (Rectangle rectangle : rectangles) {
      rectangle.erase(Point.of(leftX, topY), Point.of(rightX, bottomY));
    }
  }

  public void dragAndDrop(int selectX, int selectY, int releaseX, int releaseY) {
    for (Rectangle rectangle : rectangles) {
      if (rectangle.doesExist(Point.of(selectX, selectY))) {
        rectangle.dragAndDrop(Point.of(selectX, selectY), Point.of(releaseX, releaseY));
        break;
      }
    }
  }

  public void bringToFront(int selectX, int selectY) {
    Iterator<Rectangle> iterator = rectangles.iterator();
    while (iterator.hasNext()) {
      var rectangle = iterator.next();
      if (rectangle.doesExist(Point.of(selectX, selectY))) {
        iterator.remove();
        rectangles.offerFirst(rectangle);
        break;
      }
    }
  }

  public void printCanvas() {
    char[][] board = new char[6][10];
    for (char[] row : board) {
      Arrays.fill(row, ' ');
    }
    var iterator = rectangles.descendingIterator();
    while (iterator.hasNext()) {
      var rectangle = iterator.next();
      rectangle.fill(board);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        sb.append(board[i][j]);
      }
      sb.append('\n');
    }
    String result = sb.toString();
    System.out.println(result);
  }
}
