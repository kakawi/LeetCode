package com.leetcode.stack.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicCalculatorII_227Test {

  private final BasicCalculatorII_227 solution = new BasicCalculatorII_227_WoStack();

  @Test
  void calculate_example1() {
    // given
    final String s = "3+2*2";

    // expected
    final int expected = 7;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example2() {
    // given
    final String s = "3/2 ";

    // expected
    final int expected = 1;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example3() {
    // given
    final String s = "3+5 / 2 ";

    // expected
    final int expected = 5;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example4() {
    // given
    final String s = "1-1+1";

    // expected
    final int expected = 1;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example5() {
    // given
    final String s = " 3/2 ";

    // expected
    final int expected = 1;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }
}
