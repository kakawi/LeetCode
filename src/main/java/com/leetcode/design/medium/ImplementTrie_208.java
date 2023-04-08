package com.leetcode.design.medium;

/**
 * Ref: <a href="https://leetcode.com/problems/implement-trie-prefix-tree">208. Implement Trie (Prefix Tree)</a>
 */
public interface ImplementTrie_208 {

  void insert(String word);

  boolean search(String word);

  boolean startsWith(String prefix);
}
