package com.leetcode.graph.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BusRoutes_815Test {

  private final BusRoutes_815 solution = new BusRoutes_815_Impl();

  @Test
  void numBusesToDestination_example1() {
    // given
    final int[][] routes = {
        {1, 2, 7},
        {3, 6, 7}
    };
    final int source = 1;
    final int target = 6;

    // expected
    final int expected = 2;

    // when
    final int result = solution.numBusesToDestination(routes, source, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void numBusesToDestination_example2() {
    // given
    final int[][] routes = {
        {7, 12},
        {4, 5, 15},
        {6},
        {15, 19},
        {9, 12, 13}
    };
    final int source = 15;
    final int target = 12;

    // expected
    final int expected = -1;

    // when
    final int result = solution.numBusesToDestination(routes, source, target);

    // then
    assertEquals(expected, result);
  }

  @Test
  void numBusesToDestination_example3() {
    // given
    final int[][] routes = {
        {1, 7},
        {3, 5}
    };
    final int source = 5;
    final int target = 5;

    // expected
    final int expected = 0;

    // when
    final int result = solution.numBusesToDestination(routes, source, target);

    // then
    assertEquals(expected, result);
  }
}
