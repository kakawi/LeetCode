package com.leetcode.stack.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecodeString_394Test {

  private final DecodeString_394 solution = new DecodeString_394_2Stacks();

  @Test
  void decodeString_example1() {
    // given
    final String source = "3[a]2[bc]";

    // expected
    final String expected = "aaabcbc";

    // when
    final String result = solution.decodeString(source);

    // then
    assertEquals(expected, result);
  }

  @Test
  void decodeString_example2() {
    // given
    final String source = "3[a2[c]]";

    // expected
    final String expected = "accaccacc";

    // when
    final String result = solution.decodeString(source);

    // then
    assertEquals(expected, result);
  }

  @Test
  void decodeString_example3() {
    // given
    final String source = "2[abc]3[cd]ef";

    // expected
    final String expected = "abcabccdcdcdef";

    // when
    final String result = solution.decodeString(source);

    // then
    assertEquals(expected, result);
  }
}
