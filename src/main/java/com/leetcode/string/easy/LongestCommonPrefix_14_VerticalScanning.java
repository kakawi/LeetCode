package com.leetcode.string.easy;

public class LongestCommonPrefix_14_VerticalScanning implements LongestCommonPrefix_14 {

  @Override
  public String longestCommonPrefix(final String[] strs) {
    String prefix = "";

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        final String str = strs[j];
        if (i == str.length() || c != str.charAt(i)) return prefix;
      }
      prefix += c;
    }

    return prefix;
  }
}
