package com.leetcode.stack.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class AsteroidCollision_735Test {

  private final AsteroidCollision_735 solution = new AsteroidCollision_735_Array();

  @Test
  void asteroidCollision_example1() {
    // given
    final int[] asteroids = {5, 10, -5};

    // expected
    final int[] expected = {5, 10};

    // when
    final int[] result = solution.asteroidCollision(asteroids);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void asteroidCollision_example2() {
    // given
    final int[] asteroids = {8, -8};

    // expected
    final int[] expected = {};

    // when
    final int[] result = solution.asteroidCollision(asteroids);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void asteroidCollision_example3() {
    // given
    final int[] asteroids = {10, 2, -5};

    // expected
    final int[] expected = {10};

    // when
    final int[] result = solution.asteroidCollision(asteroids);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void asteroidCollision_example4() {
    // given
    final int[] asteroids = {-2, -1, 1, 2};

    // expected
    final int[] expected = {-2, -1, 1, 2};

    // when
    final int[] result = solution.asteroidCollision(asteroids);

    // then
    assertArrayEquals(expected, result);
  }

  @Test
  void asteroidCollision_example5() {
    // given
    final int[] asteroids = {1, -2, -2, -2};

    // expected
    final int[] expected = {-2, -2, -2};

    // when
    final int[] result = solution.asteroidCollision(asteroids);

    // then
    assertArrayEquals(expected, result);
  }
}
