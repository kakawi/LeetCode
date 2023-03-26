package com.leetcode.string.easy;

public class LongestCommonPrefix_14_HorizontalScanning implements LongestCommonPrefix_14 {

  @Override
  public String longestCommonPrefix(final String[] strs) {
    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        prefix = prefix.substring(0 , prefix.length() - 1);
        if (prefix.isEmpty())
          return "";
      }
    }

    return prefix;
  }
}
