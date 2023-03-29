package com.leetcode.greedy.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaskScheduler_621Test {

  private final TaskScheduler_621 solution = new TaskScheduler_621_Impl();

  @Test
  void leastInterval_example1() {
    // given
    final char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
    final int n = 2;

    // expected
    final int expected = 8;

    // when
    final int result = solution.leastInterval(tasks, n);

    // then
    assertEquals(expected, result);
  }

  @Test
  void leastInterval_example2() {
    // given
    final char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
    final int n = 0;

    // expected
    final int expected = 6;

    // when
    final int result = solution.leastInterval(tasks, n);

    // then
    assertEquals(expected, result);
  }

  @Test
  void leastInterval_example3() {
    // given
    final char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
    final int n = 2;

    // expected
    final int expected = 16;

    // when
    final int result = solution.leastInterval(tasks, n);

    // then
    assertEquals(expected, result);
  }

  @Test
  void leastInterval_example4() {
    // given
    final char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'};
    final int n = 2;

    // expected
    final int expected = 12;

    // when
    final int result = solution.leastInterval(tasks, n);

    // then
    assertEquals(expected, result);
  }

  @Test
  void leastInterval_example5() {
    // given
    final char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'};
    final int n = 1;

    // expected
    final int expected = 12;

    // when
    final int result = solution.leastInterval(tasks, n);

    // then
    assertEquals(expected, result);
  }
}
