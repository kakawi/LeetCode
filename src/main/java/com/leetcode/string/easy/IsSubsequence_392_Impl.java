package com.leetcode.string.easy;

public class IsSubsequence_392_Impl implements IsSubsequence_392 {

  @Override
  public boolean isSubsequence(final String s, final String t) {
    int i = 0;
    for (char targetChar : t.toCharArray()) {
      if (i == s.length()) {
        return true;
      }
      if (s.charAt(i) == targetChar) {
        i++;
      }
    }
    return i == s.length();
  }
}
