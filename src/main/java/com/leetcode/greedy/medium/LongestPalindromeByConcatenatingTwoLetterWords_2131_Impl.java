package com.leetcode.greedy.medium;

public class LongestPalindromeByConcatenatingTwoLetterWords_2131_Impl implements LongestPalindromeByConcatenatingTwoLetterWords_2131 {

  @Override
  public int longestPalindrome(final String[] words) {
    int result = 0;
    final int[][] lettersCombination = new int[26][26];
    for (final String word : words) {
      final int firstChar = word.charAt(0) - 'a';
      final int secondChar = word.charAt(1) - 'a';
      if (lettersCombination[secondChar][firstChar] > 0) {
        --lettersCombination[secondChar][firstChar];
        result += 4;
      } else {
        lettersCombination[firstChar][secondChar]++;
      }
    }

    for (int i = 0; i < lettersCombination.length; i++) {
      if (lettersCombination[i][i] > 0) return result + 2;
    }

    return result;
  }
}
