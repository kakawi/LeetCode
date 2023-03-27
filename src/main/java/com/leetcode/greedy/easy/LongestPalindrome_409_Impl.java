package com.leetcode.greedy.easy;

public class LongestPalindrome_409_Impl implements LongestPalindrome_409 {

  @Override
  public int longestPalindrome(final String s) {
    boolean[] seenLetters = new boolean[256];
    int pairs = 0;
    for (final char letter : s.toCharArray()) {
      if (seenLetters[letter]) {
        pairs++;
        seenLetters[letter] = false;
      } else {
        seenLetters[letter] = true;
      }
    }

    if (s.length() > pairs * 2) {
      return pairs * 2 + 1;
    }

    return pairs * 2;
  }
}
