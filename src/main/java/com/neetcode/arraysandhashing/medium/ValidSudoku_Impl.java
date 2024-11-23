package com.neetcode.arraysandhashing.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * We can optimize memory by using Bitmask
 */
public class ValidSudoku_Impl implements ValidSudoku {
  private static final char EMPTY = '.';

  public boolean isValidSudoku(char[][] board) {
    Map<Integer, Set<Integer>> rows = new HashMap<>();
    Map<Integer, Set<Integer>> cols = new HashMap<>();
    Map<String, Set<Integer>> squares = new HashMap<>();

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == EMPTY) {
          continue;
        }

        rows.putIfAbsent(i, new HashSet<>());
        cols.putIfAbsent(j, new HashSet<>());
        String squareKey = generateSquareKey(i, j);
        squares.putIfAbsent(squareKey, new HashSet<>());

        int value = board[i][j] - '1';
        if (rows.get(i).add(value) == false || cols.get(j).add(value) == false
            || squares.get(squareKey).add(value) == false) {
          return false;
        }
      }
    }
    return true;
  }

  private String generateSquareKey(int row, int col) {
    return row / 3 + "-" + col / 3;
  }
}
