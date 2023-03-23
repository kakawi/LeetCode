package com.leetcode.slidingwindow.medium;

public class LongestRepeatingCharacterReplacement_424_Impl implements LongestRepeatingCharacterReplacement_424 {

  @Override
  public int characterReplacement(final String s, final int k) {
    int[] frequency = new int[26];
    int highestFrequency = 0; // at the moment
    int maxStringLength = 0;
    int leftBorder = 0;

    for (int rightBorder = 0; rightBorder < s.length(); rightBorder++) {
      final char c = s.charAt(rightBorder);
      final int charFrequency = ++frequency[getIndex(c)];
      highestFrequency = Math.max(highestFrequency, charFrequency);

      final int currentSubstringLength = rightBorder - leftBorder + 1;
      final int lettersToChange = currentSubstringLength - highestFrequency;
      if (lettersToChange > k) {
        frequency[getIndex(s.charAt(leftBorder))]--;
        leftBorder++;
      } else {
        maxStringLength = Math.max(maxStringLength, currentSubstringLength);
      }
    }

    return maxStringLength;
  }

  private static int getIndex(char c) {
    return c - 'A';
  }
}
