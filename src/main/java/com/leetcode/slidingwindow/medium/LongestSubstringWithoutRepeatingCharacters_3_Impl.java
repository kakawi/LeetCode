package com.leetcode.slidingwindow.medium;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters_3_Impl implements
    LongestSubstringWithoutRepeatingCharacters_3 {

  @Override
  public int lengthOfLongestSubstring(final String s) {
    final int[] indexOfLetter = new int[256];
    Arrays.fill(indexOfLetter, -1);
    int maxLength = 0;
    int currentLength = 0;
    int left = -1;
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      final int lastIndex = indexOfLetter[c];
      if (lastIndex >= left) {
        currentLength = (i - lastIndex) - 1;
        left = lastIndex + 1;
      }
      indexOfLetter[c] = i;
      currentLength++;
      maxLength = Math.max(maxLength, currentLength);
    }

    return maxLength;
  }
}
