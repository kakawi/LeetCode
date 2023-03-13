package com.leetcode.stack.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackspaceStringCompare_844Test {

  private final BackspaceStringCompare_844 solution = new BackspaceStringCompare_844_Without_Stack();

  @Test
  void backspaceCompare_example1() {
    // given
    final String s = "ab#c";
    final String t = "ad#c";

    // when
    final boolean result = solution.backspaceCompare(s, t);

    // then
    assertTrue(result);
  }

  @Test
  void backspaceCompare_example2() {
    // given
    final String s = "ab##";
    final String t = "c#d#";

    // when
    final boolean result = solution.backspaceCompare(s, t);

    // then
    assertTrue(result);
  }

  @Test
  void backspaceCompare_example3() {
    // given
    final String s = "a#c";
    final String t = "b";

    // when
    final boolean result = solution.backspaceCompare(s, t);

    // then
    assertFalse(result);
  }

  @Test
  void backspaceCompare_example4() {
    // given
    final String s = "a##c";
    final String t = "#a#c";

    // when
    final boolean result = solution.backspaceCompare(s, t);

    // then
    assertTrue(result);
  }

  @Test
  void backspaceCompare_example5() {
    // given
    final String s = "y#fo##f";
    final String t = "y#f#o##f";

    // when
    final boolean result = solution.backspaceCompare(s, t);

    // then
    assertTrue(result);
  }
}