package com.neetcode.arraysandhashing.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {
  private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence_Impl();

  @Test
  void example1() {
    // given
    int[] input = { 2, 20, 4, 10, 3, 4, 5 };

    // expected
    int expected = 4;

    // when
    int result = solution.longestConsecutive(input);

    // then
    assertEquals(expected, result);
  }

  @Test
  void example2() {
    // given
    int[] input = { 0, 3, 2, 5, 4, 6, 1, 1 };

    // expected
    int expected = 7;

    // when
    int result = solution.longestConsecutive(input);

    // then
    assertEquals(expected, result);
  }
}
