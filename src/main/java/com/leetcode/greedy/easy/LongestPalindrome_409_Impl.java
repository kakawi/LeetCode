package com.leetcode.greedy.easy;

public class LongestPalindrome_409_Impl implements LongestPalindrome_409 {

  @Override
  public int longestPalindrome(final String s) {
    int[] numberOfLetters = new int[123];
    int result = 0;
    for (final char currentChar : s.toCharArray()) {
      final int elements = ++numberOfLetters[currentChar - 'A'];
      if (elements == 2) {
        result++;
        numberOfLetters[currentChar - 'A'] = 0;
      }
    }

    if (s.length() > result * 2) {
      return result * 2 + 1;
    }

    return result * 2;
  }
}
