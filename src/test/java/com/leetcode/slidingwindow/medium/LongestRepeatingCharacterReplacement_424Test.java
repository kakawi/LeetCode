package com.leetcode.slidingwindow.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.slidingwindow.medium.LongestRepeatingCharacterReplacement_424;
import com.leetcode.slidingwindow.medium.LongestRepeatingCharacterReplacement_424_Impl;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacement_424Test {

  private final LongestRepeatingCharacterReplacement_424 solution = new LongestRepeatingCharacterReplacement_424_Impl();

  @Test
  void characterReplacement_example1() {
    // given
    final String s = "ABAB";
    final int k = 2;

    // expected
    final int expected = 4;

    // when
    final int result = solution.characterReplacement(s, k);

    // then
    assertEquals(expected, result);
  }

  @Test
  void characterReplacement_example2() {
    // given
    final String s = "AABABBA";
    final int k = 1;

    // expected
    final int expected = 4;

    // when
    final int result = solution.characterReplacement(s, k);

    // then
    assertEquals(expected, result);
  }
}