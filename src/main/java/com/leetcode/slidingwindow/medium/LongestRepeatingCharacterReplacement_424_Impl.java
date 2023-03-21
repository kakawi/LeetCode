package com.leetcode.slidingwindow.medium;

public class LongestRepeatingCharacterReplacement_424_Impl implements LongestRepeatingCharacterReplacement_424 {

  @Override
  public int characterReplacement(final String s, final int k) {
    int[] frequency = new int[26];
    int biggestFrequency = 0; // at the moment
    int maxSubstring = 0;
    int leftBorder = 0;

    for (int rightBorder = 0; rightBorder < s.length(); rightBorder++) {
      final char c = s.charAt(rightBorder);
      final int charFrequency = ++frequency[getIndex(c)];
      biggestFrequency = Math.max(biggestFrequency, charFrequency);

      final int currentSubstringLength = rightBorder - leftBorder + 1;
      final int lettersToChange = currentSubstringLength - biggestFrequency;
      if (lettersToChange > k) {
        frequency[getIndex(s.charAt(leftBorder))]--;
        leftBorder++;
      } else {
        maxSubstring = Math.max(maxSubstring, currentSubstringLength);
      }
    }

    return maxSubstring;
  }

  private static int getIndex(char c) {
    return c - 'A';
  }
}
