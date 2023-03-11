package com.leetcode.string.easy;

public class Is_Subsequence_392 {

  public static void main(String[] args) {
    final Is_Subsequence_392 solution = new Is_Subsequence_392();
//    solution.isSubsequence("abc", "ahbgdc");
    solution.isSubsequence("axc", "ahbgdc");
  }

  public boolean isSubsequence(String s, String t) {
    int j = 0;
    for (int i = 0; i < t.length() && j < s.length(); i++) {
      if (t.charAt(i) == s.charAt(j)) {
        j++;
      }
    }
    return j == s.length();
  }

  /**
   * using while loop, and 1 time calculation of variables increases the speed
   * Idea is totally the same
   */
  public boolean isSubsequence2(String s, String t) {
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
