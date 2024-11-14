package com.neetcode.arraysandhashing.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsAnagramTest {
  private final IsAnagram solution = new IsAnagram_Impl();

  @Test
  void example1() {
    // given
    final String s = "racecar";
    final String t = "carrace";

    // when
    final boolean result = solution.isAnagram(s, t);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    final String s = "jar";
    final String t = "jam";

    // when
    final boolean result = solution.isAnagram(s, t);

    // then
    assertFalse(result);
  }
}
