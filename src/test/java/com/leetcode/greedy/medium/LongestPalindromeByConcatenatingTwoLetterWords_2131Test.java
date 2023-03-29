package com.leetcode.greedy.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestPalindromeByConcatenatingTwoLetterWords_2131Test {

  private final LongestPalindromeByConcatenatingTwoLetterWords_2131 solution = new LongestPalindromeByConcatenatingTwoLetterWords_2131_Impl();

  @Test
  void longestPalindrome_example1() {
    // given
    final String[] words = {"lc", "cl", "gg"};

    // expected
    final int expected = 6;

    // when
    final int result = solution.longestPalindrome(words);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestPalindrome_example2() {
    // given
    final String[] words = {"ab", "ty", "yt", "lc", "cl", "ab"};

    // expected
    final int expected = 8;

    // when
    final int result = solution.longestPalindrome(words);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestPalindrome_example3() {
    // given
    final String[] words = {"cc", "ll", "xx"};

    // expected
    final int expected = 2;

    // when
    final int result = solution.longestPalindrome(words);

    // then
    assertEquals(expected, result);
  }

  @Test
  void longestPalindrome_example4() {
    // given
    final String[] words = {"qo", "fo", "fq", "qf", "fo", "ff", "qq", "qf", "of", "of", "oo", "of",
        "of", "qf", "qf", "of"};

    // expected
    final int expected = 14;

    // when
    final int result = solution.longestPalindrome(words);

    // then
    assertEquals(expected, result);
  }
}
