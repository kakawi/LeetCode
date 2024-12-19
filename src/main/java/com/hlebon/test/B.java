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
  private final Point leftTopCorner;
  private final boolean[][] erasedElements; // true if element was erased
  private final char symbol;

  public Rectangle(char symbol, int leftX, int topY, int rightX, int bottomY) {
    this.symbol = symbol;
    this.leftTopCorner = new Point(leftX, topY);
    this.erasedElements = new boolean[bottomY - topY + 1][rightX - leftX + 1];
  }

  public boolean doesExist(Point point) {
    int x = point.x - leftTopCorner.x;
    int y = point.y - leftTopCorner.y;
    if (x < 0 || x >= erasedElements[0].length || y < 0 || y >= erasedElements.length) {
      return false;
    }
    return !erasedElements[y][x];
  }

  private Point rightCorner() {
    return Point.of(leftTopCorner.x + erasedElements[0].length - 1, leftTopCorner.y + erasedElements.length - 1);
  }

  public void dragAndDrop(Point from, Point to) {
    int xMovement = to.x - from.x;
    int yMovement = to.y - from.y;
    leftTopCorner.x += xMovement;
    leftTopCorner.y += yMovement;
  }

  public void fill(char[][] board) {
    for (int yRelative = 0; yRelative < erasedElements.length; yRelative++) {
      for (int xRelative = 0; xRelative < erasedElements[0].length; xRelative++) {
        if (!erasedElements[yRelative][xRelative]) {
          int y = leftTopCorner.y + yRelative;
          int x = leftTopCorner.x + xRelative;
          if (x < 0 || x >= board[0].length || y < 0 || y >= board.length) {
            continue;
          }

          board[leftTopCorner.y + yRelative][leftTopCorner.x + xRelative] = symbol;
        }
      }
    }
  }

  public void eraseArea(Point from, Point to) {
    if (leftTopCorner.x > to.x || leftTopCorner.y > to.y) {
      return;
    }
    if (rightCorner().x < from.x || rightCorner().y < from.y) {
      return;
    }

    int fromXRelative = Math.max(from.x - leftTopCorner.x, 0);
    int fromYRelative = Math.max(from.y - leftTopCorner.y, 0);
    int toXRelative = Math.min(to.x - leftTopCorner.x, erasedElements[0].length - 1);
    int toYRelative = Math.min(to.y - leftTopCorner.y, erasedElements.length - 1);
    for (int y = fromYRelative; y <= toYRelative; y++) {
      for (int x = fromXRelative; x <= toXRelative; x++) {
        erasedElements[y][x] = true;
      }
    }
  }
}

/**
 * Thoughts:
 * - I have to save all rectangles as separate layer, because it can be moved and
 * brought to the front
 * - I choose that I would calculate what rectangle is first, I will print all
 * of them
 * Questions:
 * - Out of borders rectangles?
 * - Impossible coordinates?
 * - What to do if it was moved out of border?
 * - Limits of rectangles?
 * - Do I need to cover with Unit Tests?
 */
public class B {
  private final LinkedList<Rectangle> rectangles = new LinkedList<>();

  public void drawRectangle(char c, int leftX, int topY, int rightX, int bottomY) {
    var rectangle = new Rectangle(c, leftX, topY, rightX, bottomY);
    rectangles.offerFirst(rectangle);
  }

  public void eraseErea(int leftX, int topY, int rightX, int bottomY) {
    for (Rectangle rectangle : rectangles) {
      rectangle.eraseArea(Point.of(leftX, topY), Point.of(rightX, bottomY));
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
