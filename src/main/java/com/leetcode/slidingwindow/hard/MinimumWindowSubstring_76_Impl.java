package com.leetcode.slidingwindow.hard;

public class MinimumWindowSubstring_76_Impl implements MinimumWindowSubstring_76 {

  @Override
  public String minWindow(final String s, final String t) {
    final int[] map = initializeTargetFrequency(t);
    int left = 0;
    int minStart = -1;
    int minLen = Integer.MAX_VALUE;
    // instead of comparing frequency we can just use a `counter` to understand
    // if all characters are in substring or not
    int counter = t.length();

    for (int right = 0; right < s.length(); right++) {
      final char rightCharacter = s.charAt(right);
      if (map[rightCharacter] > 0) counter--;
      map[rightCharacter]--;
      // we found all characters that are in Target
      while (counter == 0) {
        if (minLen > right - left) {
          minLen = right - left + 1;
          minStart = left;
        }
        final char leftCharacter = s.charAt(left);
        map[leftCharacter]++;
        left++;
        // we missed one character from target
        if (map[leftCharacter] > 0) counter = 1;
      }
    }

    if (minStart == -1) {
      return "";
    }

    return s.substring(minStart, minStart + minLen);
  }

  private static int[] initializeTargetFrequency(final String t) {
    final int [] map = new int[128];
    for (char targetCharacter : t.toCharArray()) {
      map[targetCharacter]++;
    }
    return map;
  }
}
