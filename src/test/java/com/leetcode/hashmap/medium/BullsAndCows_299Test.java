package com.leetcode.hashmap.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BullsAndCows_299Test {

  private final BullsAndCows_299 solution = new BullsAndCows_299_Impl();

  @Test
  void getHint_example1() {
    // given
    final String secret = "1807";
    final String guess = "7810";

    // when
    final String result = solution.getHint(secret, guess);

    // then
    assertEquals("1A3B", result);
  }

  @Test
  void getHint_example2() {
    // given
    final String secret = "1123";
    final String guess = "0111";

    // when
    final String result = solution.getHint(secret, guess);

    // then
    assertEquals("1A1B", result);
  }
}