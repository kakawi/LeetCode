package com.leetcode.design.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacks_232Test {

  @Test
  void example1() {
    // given
    var queue = new ImplementQueueUsingStacks_232_Impl();

    // when
    queue.push(1);
    queue.push(2);
    assertEquals(1, queue.peek());
    assertEquals(1, queue.pop());
    assertFalse(queue.empty());
  }
}
