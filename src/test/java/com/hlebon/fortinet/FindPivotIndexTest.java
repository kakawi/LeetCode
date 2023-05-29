package com.hlebon.fortinet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

  @Test
  void isBalanced_example1() {
    // given
    final String s = "{}()";

    // when
    boolean result = Task1.isBalanced(s);

    // then
    assertTrue(result);
  }

  @Test
  void isBalanced_example2() {
    // given
    final String s = "({()})";

    // when
    boolean result = Task1.isBalanced(s);

    // then
    assertTrue(result);
  }

  @Test
  void isBalanced_example3() {
    // given
    final String s = "{}(";

    // when
    boolean result = Task1.isBalanced(s);

    // then
    assertFalse(result);
  }
}
