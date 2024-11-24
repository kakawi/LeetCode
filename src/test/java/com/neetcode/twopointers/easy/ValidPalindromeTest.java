package com.neetcode.twopointers.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
  private final ValidPalindrome solution = new ValidPalindrome_Impl();

  @Test
  void example1() {
    // given
    String input = "Was it a car or a cat I saw?";

    // when
    boolean result = solution.isPalindrome(input);

    // then
    assertTrue(result);
  }

  @Test
  void example2() {
    // given
    String input = "tab a cat";

    // when
    boolean result = solution.isPalindrome(input);

    // then
    assertFalse(result);
  }
}
