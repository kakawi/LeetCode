package com.leetcode.slidingwindow.medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters_3_Impl implements
    LongestSubstringWithoutRepeatingCharacters_3 {

  @Override
  public int lengthOfLongestSubstring(final String s) {
    final int[] lastIndexOfLetter = new int[256];
    Arrays.fill(lastIndexOfLetter, -1);
    int maxLength = 0;
    int currentLength = 0;
    int left = 0;
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      final int lastIndex = lastIndexOfLetter[c];
      if (lastIndex >= left) {
        left = lastIndex + 1;
        currentLength = i - left + 1;
      } else {
        currentLength++;
        maxLength = Math.max(maxLength, currentLength);
      }
      lastIndexOfLetter[c] = i;
    }

    return maxLength;
  }
}
