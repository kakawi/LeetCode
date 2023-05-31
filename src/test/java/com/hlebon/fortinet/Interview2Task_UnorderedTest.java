package com.hlebon.fortinet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Interview2Task_UnorderedTest {

  private final Interview2Task_Unordered solution = new Interview2Task_Unordered_Sum();

  @Test
  void findDuplicate_example1() {
    // given
    final int[] input = {1, 2, 2, 3, 4, 5, 6};

    // expected
    final int expected = 2;

    // when
    int result = solution.findDuplicate(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void findDuplicate_example2() {
    // given
    final int[] input = {1, 1, 2, 3, 4, 5, 6};

    // expected
    final int expected = 1;

    // when
    int result = solution.findDuplicate(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void findDuplicate_example3() {
    // given
    final int[] input = {1, 2, 3, 4, 5, 6, 6};

    // expected
    final int expected = 6;

    // when
    int result = solution.findDuplicate(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void findDuplicate_example4() {
    // given
    final int[] input = {1, 2, 3, 6, 5, 6, 4, 7};

    // expected
    final int expected = 6;

    // when
    int result = solution.findDuplicate(input);

    // then
    assertEquals(expected, result);
  }
}
