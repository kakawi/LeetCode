package com.leetcode.design.medium;

import com.leetcode.tree.TreeNode;

import java.util.Optional;

public class ImplementTrie_208_Impl implements ImplementTrie_208 {

  private final TrieNode root = new TrieNode();

  @Override
  public void insert(final String word) {
    TrieNode currentNode = root;
    for (final char c : word.toCharArray()) {
      final int index = getIndex(c);
      if (currentNode.alphabet[index] == null) {
        currentNode.alphabet[index] = new TrieNode();
      }
      currentNode = currentNode.alphabet[index];
    }
    currentNode.isWord = true;
  }

  @Override
  public boolean search(final String word) {
    return getTrieNode(word)
            .map(trieNode -> trieNode.isWord)
            .orElse(false);
  }

  @Override
  public boolean startsWith(final String prefix) {
    return getTrieNode(prefix).isPresent();
  }

  private Optional<TrieNode> getTrieNode(String word) {
    TrieNode currentNode = root;
    for (final char c : word.toCharArray()) {
      final int index = getIndex(c);
      if (currentNode.alphabet[index] == null) {
        return Optional.empty();
      }
      currentNode = currentNode.alphabet[index];
    }
    return Optional.of(currentNode);
  }

  private static int getIndex(final char c) {
    return c - 'a';
  }

  private static class TrieNode {
    final TrieNode[] alphabet = new TrieNode[26];
    boolean isWord;
  }
}
