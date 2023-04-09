package com.leetcode.stack.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BasicCalculator_224Test {

  private final BasicCalculator_224 solution = new BasicCalculator_224_Stack();

  @Test
  void calculate_example1() {
    // given
    final String s = "1 + 1";

    // expected
    final int expected = 2;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example2() {
    // given
    final String s = " 2-1 + 2 ";

    // expected
    final int expected = 3;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void calculate_example3() {
    // given
    final String s = "(1+(4+5+2)-3)+(6+8)";

    // expected
    final int expected = 23;

    // when
    final int result = solution.calculate(s);

    // then
    assertEquals(expected, result);
  }
}
