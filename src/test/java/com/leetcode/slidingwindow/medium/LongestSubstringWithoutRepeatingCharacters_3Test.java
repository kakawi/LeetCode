package com.leetcode.slidingwindow.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharacters_3Test {

  private final LongestSubstringWithoutRepeatingCharacters_3 solution = new LongestSubstringWithoutRepeatingCharacters_3_Impl();

  @Test
  void lengthOfLongestSubstring_example1() {
    // given
    final String s = "abcabcbb";

    // expected
    final int expected = 3;

    // when
    final int result = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void lengthOfLongestSubstring_example2() {
    // given
    final String s = "bbbbb";

    // expected
    final int expected = 1;

    // when
    final int result = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void lengthOfLongestSubstring_example3() {
    // given
    final String s = "pwwkew";

    // expected
    final int expected = 3;

    // when
    final int result = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void lengthOfLongestSubstring_example4() {
    // given
    final String s = "aabaab!bb";

    // expected
    final int expected = 3;

    // when
    final int result = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(expected, result);
  }

  @Test
  void lengthOfLongestSubstring_example5() {
    // given
    final String s = "dvdf";

    // expected
    final int expected = 3;

    // when
    final int result = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(expected, result);
  }
}
