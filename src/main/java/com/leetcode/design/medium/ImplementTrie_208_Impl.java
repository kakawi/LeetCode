package com.leetcode.design.medium;

public class ImplementTrie_208_Impl implements ImplementTrie_208 {

  private final TrieNode root = new TrieNode();

  @Override
  public void insert(final String word) {
    TrieNode currentNode = root;
    for (final char c : word.toCharArray()) {
      if (currentNode.alphabet[c] == null) {
        currentNode.alphabet[c] = new TrieNode();
      }
      currentNode = currentNode.alphabet[c];
    }
    currentNode.isWord = true;
  }

  @Override
  public boolean search(final String word) {
    TrieNode currentNode = root;
    for (final char c : word.toCharArray()) {
      if (currentNode.alphabet[c] != null) {
        currentNode = currentNode.alphabet[c];
      } else {
        return false;
      }
    }
    return currentNode.isWord;
  }

  @Override
  public boolean startsWith(final String prefix) {
    TrieNode currentNode = root;
    for (final char c : prefix.toCharArray()) {
      if (currentNode.alphabet[c] != null) {
        currentNode = currentNode.alphabet[c];
      } else {
        return false;
      }
    }
    return true;
  }

  private static class TrieNode {
    final TrieNode[] alphabet = new TrieNode[256];
    boolean isWord;
  }
}
