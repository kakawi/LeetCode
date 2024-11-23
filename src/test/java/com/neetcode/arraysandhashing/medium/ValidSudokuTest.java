package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidSudokuTest {
  private final ValidSudoku solution = new ValidSudoku_Impl();

  @Test
  public void example1() {
    // given
    char[][] input = {
        { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
        { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
        { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
        { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    // when
    boolean result = solution.isValidSudoku(input);

    // then
    assertTrue(result);
  }

  @Test
  public void example2() {
    // given
    char[][] input = {
        { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
        { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
        { '.', '9', '1', '.', '.', '.', '.', '.', '3' },
        { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
        { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    // when
    boolean result = solution.isValidSudoku(input);

    // then
    assertFalse(result);
  }
}
