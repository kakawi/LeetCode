package com.leetcode.slidingwindow.medium;

public class LongestRepeatingCharacterReplacement_424_Impl implements LongestRepeatingCharacterReplacement_424 {

  @Override
  /**
   * MostFreqLetter is kinda tricky concept. It is a counter for the most frequent letter that we met in the whole string.
   */
  public int characterReplacement(final String s, final int k) {
    int[] freq = new int[26];
    int mostFreqLetter = 0;
    int left = 0;
    int max = 0;

    for (int right = 0; right < s.length(); right++) {
      final int currentCharFreq = ++freq[s.charAt(right) - 'A'];
      mostFreqLetter = Math.max(mostFreqLetter, currentCharFreq);

      final int currentSubstringLength = right - left + 1;
      int lettersToChange = currentSubstringLength - mostFreqLetter;
      if (lettersToChange > k) {
        freq[s.charAt(left) - 'A']--;
        left++;
      } else {
        max = Math.max(max, currentSubstringLength);
      }
    }

    return max;
  }
}
