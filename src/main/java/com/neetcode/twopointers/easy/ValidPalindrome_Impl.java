package com.neetcode.twopointers.easy;

public class ValidPalindrome_Impl implements ValidPalindrome {
  public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);
      if (!isValidCharacter(leftChar)) {
        left++;
        continue;
      }
      if (!isValidCharacter(rightChar)) {
        right--;
        continue;
      }
      if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public boolean isValidCharacter(char c) {
    return Character.isLetterOrDigit(c);
  }
}
