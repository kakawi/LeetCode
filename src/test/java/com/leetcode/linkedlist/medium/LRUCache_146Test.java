package com.leetcode.linkedlist.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LRUCache_146Test {

  @Test
  void example1() {
    // given
    var cache = new LRUCache_146_Impl(2);

    // when
    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(cache.get(1), 1);
    cache.put(3, 3);
    assertEquals(cache.get(2), -1);
    cache.put(4, 4);
    assertEquals(cache.get(1), -1);
    assertEquals(cache.get(3), 3);
    assertEquals(cache.get(4), 4);
  }

  @Test
  void example2() {
    // given
    var cache = new LRUCache_146_Impl(2);

    // when
    cache.put(1, 10);
    assertEquals(cache.get(1), 10);
    cache.put(2, 20);
    cache.put(3, 30);
    assertEquals(cache.get(2), 20);
    assertEquals(cache.get(1), -1);
  }
}
