package com.leetcode.string.easy;

public class IsSubsequence_392_Impl implements IsSubsequence_392 {

  @Override
  public boolean isSubsequence(final String s, final String t) {
    int j = 0;
    for (final char c : t.toCharArray()) {
      if (s.charAt(j) == c) j++;
    }
    return j == s.length();
  }
}
