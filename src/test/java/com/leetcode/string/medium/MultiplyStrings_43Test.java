package com.leetcode.string.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplyStrings_43Test {

  private final MultiplyStrings_43 solution = new MultiplyStrings_43_Impl();

  @Test
  void multiply_example1() {
    // given
    final String num1 = "2";
    final String num2 = "3";

    // expected
    final String expected = "6";

    // when
    final String result = solution.multiply(num1, num2);

    // then
    assertEquals(expected, result);
  }

  @Test
  void multiply_example2() {
    // given
    final String num1 = "123";
    final String num2 = "456";

    // expected
    final String expected = "56088";

    // when
    final String result = solution.multiply(num1, num2);

    // then
    assertEquals(expected, result);
  }

  @Test
  void multiply_example3() {
    // given
    final String num1 = "0";
    final String num2 = "0";

    // expected
    final String expected = "0";

    // when
    final String result = solution.multiply(num1, num2);

    // then
    assertEquals(expected, result);
  }
}