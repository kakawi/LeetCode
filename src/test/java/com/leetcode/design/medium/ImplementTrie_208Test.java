package com.leetcode.design.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImplementTrie_208Test {

  private ImplementTrie_208 getSolution() {
    return new ImplementTrie_208_Impl();
  }

  @Test
  void example1() {
    // given
    var trie = getSolution();

    // when
    trie.insert("apple");
    assertTrue(trie.search("apple"));
    assertFalse(trie.search("app"));
    assertTrue(trie.startsWith("app"));
    trie.insert("app");
    assertTrue(trie.search("app"));
  }
}
