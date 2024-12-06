package com.leetcode.heap.medium;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.List;

import org.junit.jupiter.api.Test;

public class KClosestPointsToOrigin_973Test {
  private final KClosestPointsToOrigin_973 solution = new KClosestPointsToOrigin_973_Impl();

  @Test
  void example1() {
    // given
    int[][] points = { { 1, 3 }, { -2, 2 } };
    int k = 1;

    // expected
    int[][] expected = { { -2, 2 } };

    // when
    int[][] result = solution.kClosest(points, k);

    // then
    assertThat(List.of(result), containsInAnyOrder(expected));
  }

  @Test
  void example2() {
    // given
    int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
    int k = 2;

    // expected
    int[][] expected = { { 3, 3 }, { -2, 4 } };

    // when
    int[][] result = solution.kClosest(points, k);

    // then
    assertThat(List.of(result), containsInAnyOrder(expected));
  }
}
