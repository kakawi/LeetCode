package com.leetcode.binarysearchtree.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class BinarySearchTreeIterator_173Test {

  @Test
  void example1() {
    // given
    final TreeNode root = new TreeNode(7,
        new TreeNode(3),
        new TreeNode(15, new TreeNode(9), new TreeNode(20))
    );
    final BinarySearchTreeIterator_173 iterator = new BinarySearchTreeIterator_173_Impl(root);

    // then
    assertEquals(3, iterator.next());
    assertEquals(7, iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals(9, iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals(15, iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals(20, iterator.next());
    assertFalse(iterator.hasNext());
  }
}
