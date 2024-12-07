package com.leetcode.mathandgeometry.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PowXN_50Test {
  private final PowXN_50 solution = new PowXN_50_Recursion();

  private static final double EPSILON = 0.00001;

  @Test
  void example1() {
    // given
    double x = 2;
    int n = 10;

    // expected
    double expected = 1024;

    // when
    double result = solution.myPow(x, n);

    // then
    assertEquals(expected, result, EPSILON);
  }

  @Test
  void example2() {
    // given
    double x = 2.1;
    int n = 3;

    // expected
    double expected = 9.261;

    // when
    double result = solution.myPow(x, n);

    // then
    assertEquals(expected, result, EPSILON);
  }

  @Test
  void example3() {
    // given
    double x = 2;
    int n = -2;

    // expected
    double expected = 0.25;

    // when
    double result = solution.myPow(x, n);

    // then
    assertEquals(expected, result, EPSILON);
  }
}
