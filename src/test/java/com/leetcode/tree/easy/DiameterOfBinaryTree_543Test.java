package com.leetcode.tree.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.common.TreeNode;

class DiameterOfBinaryTree_543Test {

  private final DiameterOfBinaryTree_543 solution = new DiameterOfBinaryTree_543_Impl();

  @Test
  void diameterOfBinaryTree_example1() {
    // given
    final TreeNode root = new TreeNode(1,
        new TreeNode(2, new TreeNode(4), new TreeNode(5)),
        new TreeNode(3)
    );

    // expected
    final int expected = 3;

    // when
    final int result = solution.diameterOfBinaryTree(root);

    // then
    assertEquals(expected, result);
  }

  @Test
  void diameterOfBinaryTree_example2() {
    // given
    final TreeNode root = new TreeNode(1, new TreeNode(2), null);

    // expected
    final int expected = 1;

    // when
    final int result = solution.diameterOfBinaryTree(root);

    // then
    assertEquals(expected, result);
  }
}
