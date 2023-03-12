package com.leetcode.string.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IsomorphicStrings_205Test {

  private final IsomorphicStrings_205 solution = new IsomorphicStrings_205_Impl();

  @Test
  void isIsomorphic_example1() {
    // given
    final String s = "add";
    final String t = "agg";

    // when
    final boolean result = solution.isIsomorphic(s, t);

    // then
    assertTrue(result);
  }

  @Test
  void isIsomorphic_example2() {
    // given
    final String s = "foo";
    final String t = "bar";

    // when
    final boolean result = solution.isIsomorphic(s, t);

    // then
    assertFalse(result);
  }

  @Test
  void isIsomorphic_example3() {
    // given
    final String s = "paper";
    final String t = "title";

    // when
    final boolean result = solution.isIsomorphic(s, t);

    // then
    assertTrue(result);
  }
}
