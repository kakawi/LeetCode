package com.leetcode.greedy.easy;

public class Longest_Palindrome_409 {

  public static void main(String[] args) {
    final Longest_Palindrome_409 solution = new Longest_Palindrome_409();
    solution.longestPalindrome("Az");
  }

  public int longestPalindrome(String s) {
    int[] collectionOfLetters = new int[123 - 65];
    int palindromeLength = 0;
    for (final char c : s.toCharArray()) {
      collectionOfLetters[c - 65]++;
    }
    /*
    for (final int collectionOfLetter : collectionOfLetters) {
      palindromeLength += collectionOfLetter / 2;
    }
*/
    if (palindromeLength * 2 < s.length()) {
      return palindromeLength * 2 + 1;
    }

    return palindromeLength * 2;
  }
}
