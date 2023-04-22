package com.leetcode.string.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsSubsequence_392Test {

  private final IsSubsequence_392 solution = new IsSubsequence_392_Impl();

  @Test
  void isSubsequence_example1() {
    // given
    final String source = "abc";
    final String target = "ahbgdc";

    // when
    final boolean result = solution.isSubsequence(source, target);

    // then
    assertTrue(result);
  }

  @Test
  void isSubsequence_example2() {
    // given
    final String source = "axc";
    final String target = "ahbgdc";

    // when
    final boolean result = solution.isSubsequence(source, target);

    // then
    assertFalse(result);
  }
}