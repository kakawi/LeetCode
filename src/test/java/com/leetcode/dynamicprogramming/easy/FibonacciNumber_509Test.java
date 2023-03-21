package com.leetcode.dynamicprogramming.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciNumber_509Test {

  private final FibonacciNumber_509 solution = new FibonacciNumber_509_Impl();

  @Test
  void fib_0() {
    // given
    final int n = 0;

    // when
    final int result = solution.fib(n);

    // then
    assertEquals(0, result);
  }

  @Test
  void fib_1() {
    // given
    final int n = 1;

    // when
    final int result = solution.fib(n);

    // then
    assertEquals(1, result);
  }

  @Test
  void fib_2() {
    // given
    final int n = 2;

    // when
    final int result = solution.fib(n);

    // then
    assertEquals(1, result);
  }

  @Test
  void fib_3() {
    // given
    final int n = 3;

    // when
    final int result = solution.fib(n);

    // then
    assertEquals(2, result);
  }

  @Test
  void fib_4() {
    // given
    final int n = 4;

    // when
    final int result = solution.fib(n);

    // then
    assertEquals(3, result);
  }
}
