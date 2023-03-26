package com.leetcode.string.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonPrefix_14Test {

  private final LongestCommonPrefix_14 solution = new LongestCommonPrefix_14_HorizontalScanning();

  @Test
  void longestCommonPrefix_example1() {
    // given
    final String[] strs = {"flower", "flow", "flight"};

    // expected
    final String expected = "fl";

    // when
    final String result = solution.longestCommonPrefix(strs);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestCommonPrefix_example2() {
    // given
    final String[] strs = {"dog", "racecar", "car"};

    // expected
    final String expected = "";

    // when
    final String result = solution.longestCommonPrefix(strs);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestCommonPrefix_example3() {
    // given
    final String[] strs = {"ab", "a"};

    // expected
    final String expected = "a";

    // when
    final String result = solution.longestCommonPrefix(strs);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestCommonPrefix_example4() {
    // given
    final String[] strs = {"abab", "aba", ""};

    // expected
    final String expected = "";

    // when
    final String result = solution.longestCommonPrefix(strs);

    // then
    assertEquals(expected, result);
  }
}
