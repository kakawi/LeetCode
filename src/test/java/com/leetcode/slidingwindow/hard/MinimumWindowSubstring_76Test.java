package com.leetcode.slidingwindow.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumWindowSubstring_76Test {

  private final MinimumWindowSubstring_76 solution = new MinimumWindowSubstring_76_Impl();

  @Test
  void minWindow_example1() {
    // given
    final String s = "ADOBECODEBANC";
    final String t = "ABC";

    // expected
    final String expected = "BANC";

    // when
    final String result = solution.minWindow(s, t);

    // then
    assertEquals(expected, result);
  }

  @Test
  void minWindow_example2() {
    // given
    final String s = "a";
    final String t = "a";

    // expected
    final String expected = "a";

    // when
    final String result = solution.minWindow(s, t);

    // then
    assertEquals(expected, result);
  }

  @Test
  void minWindow_example3() {
    // given
    final String s = "a";
    final String t = "aa";

    // expected
    final String expected = "";

    // when
    final String result = solution.minWindow(s, t);

    // then
    assertEquals(expected, result);
  }
}
