package com.leetcode.string.easy;

public class IsSubsequence_392_WhileLoop implements IsSubsequence_392 {

  /**
   * using while loop, and 1 time calculation of variables increases the speed
   * Idea is totally the same
   */
  @Override
  public boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;
    int n = t.length();
    int m = s.length();
    char[] ss = s.toCharArray();
    char[] tt = t.toCharArray();

    if (m < 1) {
      return true;
    }

    while (i < n) {
      if (tt[i] == ss[j]) {
        j++;
      }
      i++;

      if (j == m) {
        return true;
      }
    }

    return false;
  }

}
