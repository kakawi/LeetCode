package com.leetcode.design.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinStack_155Test {

  @Test
  void example1() {
    // given
    var minStack = new MinStack_155_Impl();

    // when
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(-3, minStack.getMin());
    minStack.pop();
    assertEquals(0, minStack.top());
    assertEquals(-2, minStack.getMin());
  }
}
