package com.hlebon.samdesk.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

  Day1 solution = new Day1();

  @Test
  void example1() {
    // given
    int[] list1 = {3,4,2,1,3,3};
    int[] list2 = {4,3,5,3,9,3};

    // expected
    int expected = 11;

    // when
    int result = solution.calculateDistance(list1, list2);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] list1 = {};
    int[] list2 = {};

    // expected
    int expected = 0;

    // when
    int result = solution.calculateDistance(list1, list2);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example3() {
    // given
    int[] list1 = {1};
    int[] list2 = {10};

    // expected
    int expected = 9;

    // when
    int result = solution.calculateDistance(list1, list2);

    // then
    assertEquals(expected, result);
  }
}
