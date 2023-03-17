package com.leetcode.greedy.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindrome_409Test {

  private final LongestPalindrome_409 solution = new LongestPalindrome_409_Impl();

  @Test
  void longestPalindrome_example1() {
    // given
    final String s = "abccccdd";

    // when
    final int result = solution.longestPalindrome(s);

    // then
    assertEquals(7, result);
  }

  @Test
  void longestPalindrome_example2() {
    // given
    final String s = "a";

    // when
    final int result = solution.longestPalindrome(s);

    // then
    assertEquals(1, result);
  }
}