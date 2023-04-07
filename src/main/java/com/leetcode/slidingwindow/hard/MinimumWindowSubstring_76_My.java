package com.leetcode.slidingwindow.hard;

public class MinimumWindowSubstring_76_My implements MinimumWindowSubstring_76 {

  @Override
  public String minWindow(final String s, final String t) {
    int left = 0;
    int leftBorder = -1;
    int minLength = Integer.MAX_VALUE;
    final int[] targetFrequency = initializeFrequency(t);
    final int[] currentFrequency = new int[256];
    for (int right = 0; right < s.length(); right++) {
      final char c = s.charAt(right);
      currentFrequency[c]++;
      while (isWindow(currentFrequency, targetFrequency)) {
        if (minLength > (right - left)) {
          minLength = right - left + 1;
          leftBorder = left;
        }
        currentFrequency[s.charAt(left)]--;
        left++;
      }
    }
    if (leftBorder == -1) {
      return "";
    }
    return s.substring(leftBorder, leftBorder + minLength);
  }

  private int[] initializeFrequency(final String s) {
    final int[] frequency = new int[130];
    for (final char c : s.toCharArray()) {
      frequency[c]++;
    }
    return frequency;
  }

  private boolean isWindow(final int[] sourceFrequency, final int[] targetFrequency) {
    for (int i = 0; i < targetFrequency.length; i++) {
      if (sourceFrequency[i] < targetFrequency[i]) {
        return false;
      }
    }
    return true;
  }
}
